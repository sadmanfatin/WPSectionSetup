package model.view;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 23 17:03:06 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProcessInfoVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        OrgId {
            public Object get(ProcessInfoVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(ProcessInfoVORowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        ProcessId {
            public Object get(ProcessInfoVORowImpl obj) {
                return obj.getProcessId();
            }

            public void put(ProcessInfoVORowImpl obj, Object value) {
                obj.setProcessId((Number)value);
            }
        }
        ,
        ProcessName {
            public Object get(ProcessInfoVORowImpl obj) {
                return obj.getProcessName();
            }

            public void put(ProcessInfoVORowImpl obj, Object value) {
                obj.setProcessName((String)value);
            }
        }
        ,
        SectionId {
            public Object get(ProcessInfoVORowImpl obj) {
                return obj.getSectionId();
            }

            public void put(ProcessInfoVORowImpl obj, Object value) {
                obj.setSectionId((Number)value);
            }
        }
        ,
        Status {
            public Object get(ProcessInfoVORowImpl obj) {
                return obj.getStatus();
            }

            public void put(ProcessInfoVORowImpl obj, Object value) {
                obj.setStatus((Number)value);
            }
        }
        ,
        BulletineStatus {
            public Object get(ProcessInfoVORowImpl obj) {
                return obj.getBulletineStatus();
            }

            public void put(ProcessInfoVORowImpl obj, Object value) {
                obj.setBulletineStatus((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ProcessInfoVORowImpl object);

        public abstract void put(ProcessInfoVORowImpl object, Object value);

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


    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PROCESSID = AttributesEnum.ProcessId.index();
    public static final int PROCESSNAME = AttributesEnum.ProcessName.index();
    public static final int SECTIONID = AttributesEnum.SectionId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int BULLETINESTATUS = AttributesEnum.BulletineStatus.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProcessInfoVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProcessId.
     * @return the ProcessId
     */
    public Number getProcessId() {
        return (Number) getAttributeInternal(PROCESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProcessId.
     * @param value value to set the  ProcessId
     */
    public void setProcessId(Number value) {
        setAttributeInternal(PROCESSID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute ProcessName.
     * @return the ProcessName
     */
    public String getProcessName() {
        return (String) getAttributeInternal(PROCESSNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProcessName.
     * @param value value to set the  ProcessName
     */
    public void setProcessName(String value) {
        setAttributeInternal(PROCESSNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SectionId.
     * @return the SectionId
     */
    public Number getSectionId() {
        return (Number) getAttributeInternal(SECTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SectionId.
     * @param value value to set the  SectionId
     */
    public void setSectionId(Number value) {
        setAttributeInternal(SECTIONID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Status.
     * @return the Status
     */
    public Number getStatus() {
        return (Number) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Status.
     * @param value value to set the  Status
     */
    public void setStatus(Number value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BulletineStatus.
     * @return the BulletineStatus
     */
    public Number getBulletineStatus() {
        return (Number) getAttributeInternal(BULLETINESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BulletineStatus.
     * @param value value to set the  BulletineStatus
     */
    public void setBulletineStatus(Number value) {
        setAttributeInternal(BULLETINESTATUS, value);
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