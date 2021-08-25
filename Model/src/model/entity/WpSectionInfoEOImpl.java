package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 22 16:15:58 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpSectionInfoEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SectionId {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getSectionId();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setSectionId((Number)value);
            }
        }
        ,
        SectionName {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getSectionName();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setSectionName((String)value);
            }
        }
        ,
        OrgId {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        CostCenter {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getCostCenter();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setCostCenter((String)value);
            }
        }
        ,
        Serial {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getSerial();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setSerial((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        WpProcessInfoEO {
            public Object get(WpSectionInfoEOImpl obj) {
                return obj.getWpProcessInfoEO();
            }

            public void put(WpSectionInfoEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpSectionInfoEOImpl object);

        public abstract void put(WpSectionInfoEOImpl object, Object value);

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


    public static final int SECTIONID = AttributesEnum.SectionId.index();
    public static final int SECTIONNAME = AttributesEnum.SectionName.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int COSTCENTER = AttributesEnum.CostCenter.index();
    public static final int SERIAL = AttributesEnum.Serial.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int WPPROCESSINFOEO = AttributesEnum.WpProcessInfoEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpSectionInfoEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpSectionInfoEO");
        }
        return mDefinitionObject;
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
     * Gets the attribute value for SectionName, using the alias name SectionName.
     * @return the SectionName
     */
    public String getSectionName() {
        return (String)getAttributeInternal(SECTIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SectionName.
     * @param value value to set the SectionName
     */
    public void setSectionName(String value) {
        setAttributeInternal(SECTIONNAME, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for CostCenter, using the alias name CostCenter.
     * @return the CostCenter
     */
    public String getCostCenter() {
        return (String)getAttributeInternal(COSTCENTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for CostCenter.
     * @param value value to set the CostCenter
     */
    public void setCostCenter(String value) {
        setAttributeInternal(COSTCENTER, value);
    }

    /**
     * Gets the attribute value for Serial, using the alias name Serial.
     * @return the Serial
     */
    public Number getSerial() {
        return (Number)getAttributeInternal(SERIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Serial.
     * @param value value to set the Serial
     */
    public void setSerial(Number value) {
        setAttributeInternal(SERIAL, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getWpProcessInfoEO() {
        return (RowIterator)getAttributeInternal(WPPROCESSINFOEO);
    }


    /**
     * @param sectionId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number sectionId) {
        return new Key(new Object[]{sectionId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String)sessionScope.get("orgId");

        

        
        super.create(attributeList);
        
        try {
            this.setOrgId(new Number(orgId));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if(orgId.equals("344")) {

            oracle.jbo.server.SequenceImpl s =
                new oracle.jbo.server.SequenceImpl("WP_SECTION_INFO_SEQ",
                                                   getDBTransaction());
            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
           this.setSectionId(sVal);
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