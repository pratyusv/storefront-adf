package oracle.storefront.ui.bean;

import oracle.adf.share.ADFContext;

public class FODSecurityBean {
    public FODSecurityBean() {
    }
    
    public boolean isAuthorizationEnabled() {
        return (ADFContext.getCurrent().getSecurityContext().isAuthorizationEnabled());
    }
}
