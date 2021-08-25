import model.services.AppModuleImpl;

import model.view.ProcessInfoVOImpl;
import model.view.ProcessInfoVORowImpl;
import model.view.SectionInfoVORowImpl;

import model.view.WpProcessInfoVOImpl;
import model.view.WpProcessInfoVORowImpl;
import model.view.WpSectionInfoVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class ManagedBean {


    private RichTable sectionTable;
    private RichTable processTable;

    public ManagedBean() {
    }
    
    AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }
    
    

    public void sectionInfoDialogListener(DialogEvent dialogEvent) {
        // Add event code here...
        
        if (dialogEvent.getOutcome().name().equals("ok")) {
            System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
 
            populateSection();
            
            AdfFacesContext.getCurrentInstance().addPartialTarget(sectionTable);
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
        
        
    }

    private void populateSection() {
        
        ViewObject sectionInfoVo = appM.getSectionInfoVO1();
        ViewObject  wpSectionInfoVo = appM.getWpSectionInfoVO1();
        
          SectionInfoVORowImpl   sectionInfoRow= null;
           WpSectionInfoVORowImpl wpSectionInfoRow = null; 
            
           String flag= null;

        Row rows[] =  sectionInfoVo.getAllRowsInRange();
        for (Row row : rows) {
            sectionInfoRow = (SectionInfoVORowImpl)row;
            
            System.out.println("=======  loop count  ====================");
            try {
                flag =  sectionInfoRow.getCheckBox();
                
                if ( flag != null &&  flag.equals("y")) {
                    
                    System.out.println(  "flag != null &&  flag.equals(\"y\")");
                    
                    wpSectionInfoRow = (WpSectionInfoVORowImpl)wpSectionInfoVo.createRow();
                
                    wpSectionInfoRow.setOrgId(   new Number (sectionInfoRow.getOrgId()));
                    wpSectionInfoRow.setOrgName(sectionInfoRow.getOrgName());
                    wpSectionInfoRow.setSectionId(sectionInfoRow.getSectionId());
                    wpSectionInfoRow.setSectionName(sectionInfoRow.getSectionName());
                    wpSectionInfoRow.setSerial(sectionInfoRow.getSl());
                
                    wpSectionInfoVo.insertRow(wpSectionInfoRow);
                
                   populateProcesses(sectionInfoRow.getSectionId(),   new Number(wpSectionInfoRow.getOrgId())   );
                }
                    
            } catch (Exception e) {
               e.printStackTrace() ;
            }

        }

        
        
    }


    private void populateProcesses(Number sectioId, Number orgId) {
        ProcessInfoVOImpl processesVo = (ProcessInfoVOImpl)appM.getProcessInfoVO1();
        processesVo.setp_section_id(sectioId.toString());
        processesVo.setp_org_id(orgId.toString());
        processesVo.executeQuery();
        Row  processesVoRows[] = processesVo.getAllRowsInRange();
        ProcessInfoVORowImpl  processVoRow ;
        
       WpProcessInfoVOImpl wpProcessInfoVo = (WpProcessInfoVOImpl)appM.getWpProcessInfoVO1();
       
        WpProcessInfoVORowImpl  wpProcessInfoVoRow ;
        
        for(Row row : processesVoRows ){
            
           processVoRow = (ProcessInfoVORowImpl)row;
            
            wpProcessInfoVoRow = (WpProcessInfoVORowImpl)wpProcessInfoVo.createRow();
            
            wpProcessInfoVoRow.setSectionId(processVoRow.getSectionId());
            wpProcessInfoVoRow.setProcessId(processVoRow.getProcessId());
            wpProcessInfoVoRow.setProcessName(processVoRow.getProcessName());  
            wpProcessInfoVo.insertRow(wpProcessInfoVoRow);
          
        }
        
     
        
        
       
    }

    public void setSectionTable(RichTable sectionTable) {
        this.sectionTable = sectionTable;
    }

    public RichTable getSectionTable() {
        return sectionTable;
    }

    public void setProcessTable(RichTable processTable) {
        this.processTable = processTable;
    }

    public RichTable getProcessTable() {
        return processTable;
    }

    public void SectionInfoPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        appM.getSectionInfoVO1().executeQuery();
    }
}
