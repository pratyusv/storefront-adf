package oracle.fod.storefront.domain.common;

import java.io.Serializable;

import oracle.jbo.JboException;
import oracle.jbo.Transaction;
import oracle.jbo.domain.DataCreationException;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 09 04:44:23 MDT 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PhoneNumber implements DomainInterface, Serializable {
    public PhoneNumber(String val) {
        mData = new String(val);
        validate();
    }
    private String mData;

    protected PhoneNumber() {
        mData = "";
    }

    public Object getData() {
        return mData;
    }

    /**
     * <b>Internal:</b> <em>Applications should not use this method.</em>
     */
    public void setContext(DomainOwnerInterface owner, Transaction trans,
                           Object obj) {
    }

    /**
     * Implements domain validation logic and throws a JboException on error.
     */
    protected void validate() {
        //  ### Implement custom domain validation logic here. ###
        int dot1pos = mData.indexOf('.');
        int dot2pos = mData.lastIndexOf('.');
        int ln = mData.length();
        if (dot1pos != 3 || dot2pos != 7 || ln != 12) {
          throw new DataCreationException(null,
             "Invalid phone number - format is xxx.xxx.xxxx",null);
        }
    }

    public String toString() {
        if (mData != null) {
            return mData.toString();
        }
        return "<null>";
    }

    public boolean equals(Object obj) {
        if (obj instanceof DomainInterface) {
            if (mData != null) {
                return mData.equals(((DomainInterface)obj).getData());
            }
            return ((DomainInterface)obj).getData() == null;
        }
        return false;
    }
}
