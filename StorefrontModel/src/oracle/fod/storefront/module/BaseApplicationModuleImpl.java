package oracle.fod.storefront.module;

import oracle.adf.share.ADFContext;

import oracle.jbo.server.ApplicationModuleImpl;


public class BaseApplicationModuleImpl extends ApplicationModuleImpl {
    private String mCurrentUser = null;
    public BaseApplicationModuleImpl() {
    }

    @Override
    public String getUserPrincipalName() {
        if (mCurrentUser == null) {
            String userPrincipal;
            if (ADFContext.getCurrent().getSecurityContext().isAuthorizationEnabled())
                userPrincipal = getUserName();
            else
                userPrincipal = "DRAPHEAL";
            mCurrentUser = userPrincipal;
            }
        return mCurrentUser;
    }
    
    public void outputStructure() { 
    System.out.println("**************************");
            outputStructure(0, getRootApplicationModule());      
    System.out.println("**************************");
    }
        
    public void outputStructure(int level, ApplicationModuleImpl am) {
            for (int i=0; i<level-1; i++) 
                System.out.print("   |   ");
            if (level > 0) 
                System.out.print("   |-->");
            
            if (am == this) 
                System.out.print("*");
            System.out.print(am.getFullName());
            System.out.print("-");
            System.out.print(am);
            System.out.println();
    }
        
    public String getUserName() {
        return ADFContext.getCurrent().getSecurityContext().getUserName().toUpperCase();
    }
        
    public boolean isUserInRole(String role) {
        return ADFContext.getCurrent().getSecurityContext().isUserInRole(role);                               
    }
                                  

}
