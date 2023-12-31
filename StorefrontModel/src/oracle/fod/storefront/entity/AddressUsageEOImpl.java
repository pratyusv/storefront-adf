package oracle.fod.storefront.entity;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 09 09:46:46 MDT 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AddressUsageEOImpl extends BaseEntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        AddressUsagesId {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getAddressUsagesId();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAddressUsagesId((Number)value);
            }
        }
        ,
        AssociatedOwnerId {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getAssociatedOwnerId();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAssociatedOwnerId((Number)value);
            }
        }
        ,
        OwnerTypeCode {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getOwnerTypeCode();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setOwnerTypeCode((String)value);
            }
        }
        ,
        AddressId {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getAddressId();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAddressId((Number)value);
            }
        }
        ,
        UsageTypeCode {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getUsageTypeCode();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setUsageTypeCode((String)value);
            }
        }
        ,
        ExpiredFlag {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getExpiredFlag();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setExpiredFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreationDate {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ObjectVersionId {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getObjectVersionId();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Address {
            public Object get(AddressUsageEOImpl obj) {
                return obj.getAddress();
            }

            public void put(AddressUsageEOImpl obj, Object value) {
                obj.setAddress((AddressEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AddressUsageEOImpl object);

        public abstract void put(AddressUsageEOImpl object, Object value);

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
    public static final int ADDRESSUSAGESID = AttributesEnum.AddressUsagesId.index();
    public static final int ASSOCIATEDOWNERID = AttributesEnum.AssociatedOwnerId.index();
    public static final int OWNERTYPECODE = AttributesEnum.OwnerTypeCode.index();
    public static final int ADDRESSID = AttributesEnum.AddressId.index();
    public static final int USAGETYPECODE = AttributesEnum.UsageTypeCode.index();
    public static final int EXPIREDFLAG = AttributesEnum.ExpiredFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static final int ADDRESS = AttributesEnum.Address.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AddressUsageEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("oracle.fod.storefront.entity.AddressUsageEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for AddressUsagesId, using the alias name AddressUsagesId.
     * @return the AddressUsagesId
     */
    public Number getAddressUsagesId() {
        return (Number)getAttributeInternal(ADDRESSUSAGESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddressUsagesId.
     * @param value value to set the AddressUsagesId
     */
    public void setAddressUsagesId(Number value) {
        setAttributeInternal(ADDRESSUSAGESID, value);
    }

    /**
     * Gets the attribute value for AssociatedOwnerId, using the alias name AssociatedOwnerId.
     * @return the AssociatedOwnerId
     */
    public Number getAssociatedOwnerId() {
        return (Number)getAttributeInternal(ASSOCIATEDOWNERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssociatedOwnerId.
     * @param value value to set the AssociatedOwnerId
     */
    public void setAssociatedOwnerId(Number value) {
        setAttributeInternal(ASSOCIATEDOWNERID, value);
    }

    /**
     * Gets the attribute value for OwnerTypeCode, using the alias name OwnerTypeCode.
     * @return the OwnerTypeCode
     */
    public String getOwnerTypeCode() {
        return (String)getAttributeInternal(OWNERTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OwnerTypeCode.
     * @param value value to set the OwnerTypeCode
     */
    public void setOwnerTypeCode(String value) {
        setAttributeInternal(OWNERTYPECODE, value);
    }

    /**
     * Gets the attribute value for AddressId, using the alias name AddressId.
     * @return the AddressId
     */
    public Number getAddressId() {
        return (Number)getAttributeInternal(ADDRESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddressId.
     * @param value value to set the AddressId
     */
    public void setAddressId(Number value) {
        setAttributeInternal(ADDRESSID, value);
    }

    /**
     * Gets the attribute value for UsageTypeCode, using the alias name UsageTypeCode.
     * @return the UsageTypeCode
     */
    public String getUsageTypeCode() {
        return (String)getAttributeInternal(USAGETYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsageTypeCode.
     * @param value value to set the UsageTypeCode
     */
    public void setUsageTypeCode(String value) {
        setAttributeInternal(USAGETYPECODE, value);
    }

    /**
     * Gets the attribute value for ExpiredFlag, using the alias name ExpiredFlag.
     * @return the ExpiredFlag
     */
    public String getExpiredFlag() {
        return (String)getAttributeInternal(EXPIREDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpiredFlag.
     * @param value value to set the ExpiredFlag
     */
    public void setExpiredFlag(String value) {
        setAttributeInternal(EXPIREDFLAG, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for ObjectVersionId, using the alias name ObjectVersionId.
     * @return the ObjectVersionId
     */
    public Number getObjectVersionId() {
        return (Number)getAttributeInternal(OBJECTVERSIONID);
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
     * @return the associated entity AddressEOImpl.
     */
    public AddressEOImpl getAddress() {
        return (AddressEOImpl)getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the associated entity AddressEOImpl.
     */
    public void setAddress(AddressEOImpl value) {
        setAttributeInternal(ADDRESS, value);
    }


    /**
     * @param addressUsagesId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number addressUsagesId) {
        return new Key(new Object[]{addressUsagesId});
    }

}
