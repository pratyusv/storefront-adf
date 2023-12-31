package oracle.fod.storefront.module.client;

import oracle.fod.storefront.module.common.FODShoppingCartAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 08 17:16:42 MDT 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FODShoppingCartAMClient extends ApplicationModuleImpl implements FODShoppingCartAM {
    /**
     * This is the default constructor (do not remove).
     */
    public FODShoppingCartAMClient() {
    }


    public void init() {
        Object _ret = this.riInvokeExportedMethod(this,"init",null,null);
        return;
    }

    public void addItemToCart(Number productId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"addItemToCart",new String [] {"oracle.jbo.domain.Number"},new Object[] {productId});
        return;
    }

    public String getUserName() {
        Object _ret = this.riInvokeExportedMethod(this,"getUserName",null,null);
        return (String)_ret;
    }

    public boolean isUserInRole(String role) {
        Object _ret =
            this.riInvokeExportedMethod(this,"isUserInRole",new String [] {"java.lang.String"},new Object[] {role});
        return ((Boolean)_ret).booleanValue();
    }
}
