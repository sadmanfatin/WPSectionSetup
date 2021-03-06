package model.services;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import model.services.common.AppModule;

import model.view.ProcessInfoVOImpl;
import model.view.SectionInfoVOImpl;


import model.view.WpProcessInfoVOImpl;
import model.view.WpSectionInfoVOImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 22 18:05:56 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    public void setSessionValues(String orgId, String userId, String respId,
                                 String respApplId) {  
        
  //      System.out.println("====================  set session values    ================================");
        
        
//       orgId = "343";
//      userId = "5219";
//       
//       System.out.println(" orgId "+ orgId  + "  data type  "+ orgId.getClass().getName());
//       
       
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);

        if (orgId != null) {
            userSession.setAttribute("orgId", orgId);
        }

        if (userId != null) {
            userSession.setAttribute("userId", userId);
        }

        if (respId != null) {
            userSession.setAttribute("respId", respId);
        }

        if (respApplId != null) {
            userSession.setAttribute("respApplId", respApplId);
        }         
         
      }


    /**
     * Container's getter for SectionInfoVO1.
     * @return SectionInfoVO1
     */
    public ViewObjectImpl getSectionInfoVO1() {
        return (ViewObjectImpl)findViewObject("SectionInfoVO1");
    }

    /**
     * Container's getter for ProcessInfoVO1.
     * @return ProcessInfoVO1
     */
    public ViewObjectImpl getProcessInfoVO1() {
        return (ViewObjectImpl)findViewObject("ProcessInfoVO1");
    }

    /**
     * Container's getter for OrgVO1.
     * @return OrgVO1
     */
    public ViewObjectImpl getOrgVO1() {
        return (ViewObjectImpl)findViewObject("OrgVO1");
    }

    /**
     * Container's getter for WpSectionInfoVO1.
     * @return WpSectionInfoVO1
     */
    public WpSectionInfoVOImpl getWpSectionInfoVO1() {
        return (WpSectionInfoVOImpl)findViewObject("WpSectionInfoVO1");
    }

    /**
     * Container's getter for WpProcessInfoVO1.
     * @return WpProcessInfoVO1
     */
    public WpProcessInfoVOImpl getWpProcessInfoVO1() {
        return (WpProcessInfoVOImpl)findViewObject("WpProcessInfoVO1");
    }

    /**
     * Container's getter for WpProcessInfoR01Link1.
     * @return WpProcessInfoR01Link1
     */
    public ViewLinkImpl getWpProcessInfoR01Link1() {
        return (ViewLinkImpl)findViewLink("WpProcessInfoR01Link1");
    }
}
