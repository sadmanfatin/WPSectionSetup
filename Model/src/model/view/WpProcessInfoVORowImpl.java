package model.view;

import model.entity.WpProcessInfoEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 25 22:56:26 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpProcessInfoVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        UnitProcessId {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getUnitProcessId();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setUnitProcessId((Number)value);
            }
        }
        ,
        ProcessName {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getProcessName();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setProcessName((String)value);
            }
        }
        ,
        WpSectionId {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getWpSectionId();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setWpSectionId((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        WpProcessId {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getWpProcessId();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setWpProcessId((Number)value);
            }
        }
        ,
        UnitSectionId {
            public Object get(WpProcessInfoVORowImpl obj) {
                return obj.getUnitSectionId();
            }

            public void put(WpProcessInfoVORowImpl obj, Object value) {
                obj.setUnitSectionId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpProcessInfoVORowImpl object);

        public abstract void put(WpProcessInfoVORowImpl object, Object value);

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
    public static final int UNITPROCESSID = AttributesEnum.UnitProcessId.index();
    public static final int PROCESSNAME = AttributesEnum.ProcessName.index();
    public static final int WPSECTIONID = AttributesEnum.WpSectionId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int WPPROCESSID = AttributesEnum.WpProcessId.index();
    public static final int UNITSECTIONID = AttributesEnum.UnitSectionId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpProcessInfoVORowImpl() {
    }

    /**
     * Gets WpProcessInfoEO entity object.
     * @return the WpProcessInfoEO
     */
    public WpProcessInfoEOImpl getWpProcessInfoEO() {
        return (WpProcessInfoEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for UNIT_PROCESS_ID using the alias name UnitProcessId.
     * @return the UNIT_PROCESS_ID
     */
    public Number getUnitProcessId() {
        return (Number) getAttributeInternal(UNITPROCESSID);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_PROCESS_ID using the alias name UnitProcessId.
     * @param value value to set the UNIT_PROCESS_ID
     */
    public void setUnitProcessId(Number value) {
        setAttributeInternal(UNITPROCESSID, value);
    }

    /**
     * Gets the attribute value for PROCESS_NAME using the alias name ProcessName.
     * @return the PROCESS_NAME
     */
    public String getProcessName() {
        return (String) getAttributeInternal(PROCESSNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PROCESS_NAME using the alias name ProcessName.
     * @param value value to set the PROCESS_NAME
     */
    public void setProcessName(String value) {
        setAttributeInternal(PROCESSNAME, value);
    }

    /**
     * Gets the attribute value for WP_SECTION_ID using the alias name WpSectionId.
     * @return the WP_SECTION_ID
     */
    public Number getWpSectionId() {
        return (Number) getAttributeInternal(WPSECTIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for WP_SECTION_ID using the alias name WpSectionId.
     * @param value value to set the WP_SECTION_ID
     */
    public void setWpSectionId(Number value) {
        setAttributeInternal(WPSECTIONID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for WP_PROCESS_ID using the alias name WpProcessId.
     * @return the WP_PROCESS_ID
     */
    public Number getWpProcessId() {
        return (Number) getAttributeInternal(WPPROCESSID);
    }

    /**
     * Sets <code>value</code> as attribute value for WP_PROCESS_ID using the alias name WpProcessId.
     * @param value value to set the WP_PROCESS_ID
     */
    public void setWpProcessId(Number value) {
        setAttributeInternal(WPPROCESSID, value);
    }

    /**
     * Gets the attribute value for UNIT_SECTION_ID using the alias name UnitSectionId.
     * @return the UNIT_SECTION_ID
     */
    public Number getUnitSectionId() {
        return (Number) getAttributeInternal(UNITSECTIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_SECTION_ID using the alias name UnitSectionId.
     * @param value value to set the UNIT_SECTION_ID
     */
    public void setUnitSectionId(Number value) {
        setAttributeInternal(UNITSECTIONID, value);
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
}
