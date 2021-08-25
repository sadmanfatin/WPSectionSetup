package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 22 17:32:29 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpProcessInfoEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        ProcessId {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getProcessId();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setProcessId((Number)value);
            }
        }
        ,
        ProcessName {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getProcessName();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setProcessName((String)value);
            }
        }
        ,
        SectionId {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getSectionId();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setSectionId((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        WpSectionInfoEO {
            public Object get(WpProcessInfoEOImpl obj) {
                return obj.getWpSectionInfoEO();
            }

            public void put(WpProcessInfoEOImpl obj, Object value) {
                obj.setWpSectionInfoEO((WpSectionInfoEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpProcessInfoEOImpl object);

        public abstract void put(WpProcessInfoEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PROCESSID = AttributesEnum.ProcessId.index();
    public static final int PROCESSNAME = AttributesEnum.ProcessName.index();
    public static final int SECTIONID = AttributesEnum.SectionId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int WPSECTIONINFOEO = AttributesEnum.WpSectionInfoEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpProcessInfoEOImpl() {
    }

    /**
     * Gets the attribute value for ProcessId, using the alias name ProcessId.
     * @return the ProcessId
     */
    public Number getProcessId() {
        return (Number)getAttributeInternal(PROCESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessId.
     * @param value value to set the ProcessId
     */
    public void setProcessId(Number value) {
        setAttributeInternal(PROCESSID, value);
    }

    /**
     * Gets the attribute value for ProcessName, using the alias name ProcessName.
     * @return the ProcessName
     */
    public String getProcessName() {
        return (String)getAttributeInternal(PROCESSNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessName.
     * @param value value to set the ProcessName
     */
    public void setProcessName(String value) {
        setAttributeInternal(PROCESSNAME, value);
    }

    /**
     * Gets the attribute value for SectionId, using the alias name SectionId.
     * @return the SectionId
     */
    public Number getSectionId() {
        return (Number)getAttributeInternal(SECTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SectionId.
     * @param value value to set the SectionId
     */
    public void setSectionId(Number value) {
        setAttributeInternal(SECTIONID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity WpSectionInfoEOImpl.
     */
    public WpSectionInfoEOImpl getWpSectionInfoEO() {
        return (WpSectionInfoEOImpl)getAttributeInternal(WPSECTIONINFOEO);
    }

    /**
     * Sets <code>value</code> as the associated entity WpSectionInfoEOImpl.
     */
    public void setWpSectionInfoEO(WpSectionInfoEOImpl value) {
        setAttributeInternal(WPSECTIONINFOEO, value);
    }

    /**
     * @param processId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number processId) {
        return new Key(new Object[]{processId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpProcessInfoEO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String)sessionScope.get("orgId");
        
        super.create(attributeList);
        
        if(orgId.equals("344")) {
        oracle.jbo.server.SequenceImpl s =
            new oracle.jbo.server.SequenceImpl("WP_PROCESS_INFO_SEQ",
                                               getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        
        this.setProcessId(sVal);
        }

    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String user = (String)sessionScope.get("userId");
        
        //        System.out.println("Document No -->" + getSrNoString());
         
        if (DML_UPDATE == operation) {
            try {
                setLastUpdatedDate((Date)Date.getCurrentDate());
                setLastUpdatedBy(new oracle.jbo.domain.Number(user));              
                
            } catch (SQLException f) {
                f.printStackTrace();
            }
        } else if (DML_INSERT == operation) {

            try {
                
                setCreationDate((Date)Date.getCurrentDate());
                setCreatedBy(new oracle.jbo.domain.Number(user));

            } catch (SQLException f) {
                f.printStackTrace();
            }
        }
             
        super.doDML(operation, e);
    }
}
