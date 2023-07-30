package oracle.fod.storefront.module;

import oracle.fod.storefront.module.common.FODCheckoutAM;

import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 09 09:06:31 MDT 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FODCheckoutAMImpl extends BaseApplicationModuleImpl implements FODCheckoutAM {
    /**
     * This is the default constructor (do not remove).
     */
    public FODCheckoutAMImpl() {
    }

    /**
     * Container's getter for ShoppingCart1.
     * @return ShoppingCart1
     */
    public ViewObjectImpl getShoppingCart1() {
        return (ViewObjectImpl)findViewObject("ShoppingCart1");
    }

    /**
     * Container's getter for ShoppingCartItem1.
     * @return ShoppingCartItem1
     */
    public ViewObjectImpl getShoppingCartItem1() {
        return (ViewObjectImpl)findViewObject("ShoppingCartItem1");
    }

    /**
     * Container's getter for Product1.
     * @return Product1
     */
    public ViewObjectImpl getProduct1() {
        return (ViewObjectImpl)findViewObject("Product1");
    }


    /**
     * Container's getter for ShoppingCartShoppingCartItemsLink1.
     * @return ShoppingCartShoppingCartItemsLink1
     */
    public ViewLinkImpl getShoppingCartShoppingCartItemsLink1() {
        return (ViewLinkImpl)findViewLink("ShoppingCartShoppingCartItemsLink1");
    }

    /**
     * Container's getter for ShoppingCartItemsProductsLink1.
     * @return ShoppingCartItemsProductsLink1
     */
    public ViewLinkImpl getShoppingCartItemsProductsLink1() {
        return (ViewLinkImpl)findViewLink("ShoppingCartItemsProductsLink1");
    }


    public void init() {
            //
            // The following code was placed in prepareSession initially
            // but the view objects were not getting properly initialized.
            // Moved here so that it can get manually invoked.
            ViewObjectImpl cart = getShoppingCart1();
            String principal = getUserPrincipalName();
            String currentUser =
                (String)cart.getNamedWhereClauseParam("CurrentUser");
            assert principal != null;

            if (!principal.equals(currentUser)) {
                cart.setNamedWhereClauseParam("CurrentUser",
                                              principal);
                cart.executeQuery();
                cart.first();
            }
        }


    /**
     * Container's getter for AddressVO1.
     * @return AddressVO1
     */
    public ViewObjectImpl getShippingAddress() {
        return (ViewObjectImpl)findViewObject("ShippingAddress");
    }

    /**
     * Container's getter for ShoppingCartAddressesLink1.
     * @return ShoppingCartAddressesLink1
     */
    public ViewLinkImpl getShoppingCartAddressesLink1() {
        return (ViewLinkImpl)findViewLink("ShoppingCartAddressesLink1");
    }

    /**
     * Container's getter for PaymentOptionVO1.
     * @return PaymentOptionVO1
     */
    public ViewObjectImpl getPaymentOption1() {
        return (ViewObjectImpl)findViewObject("PaymentOption1");
    }

    /**
     * Container's getter for ShoppingCartPaymentOptionsLink1.
     * @return ShoppingCartPaymentOptionsLink1
     */
    public ViewLinkImpl getShoppingCartPaymentOptionsLink1() {
        return (ViewLinkImpl)findViewLink("ShoppingCartPaymentOptionsLink1");
    }

    /**
     * Container's getter for AddressVO1.
     * @return AddressVO1
     */
    public ViewObjectImpl getBillingAddress() {
        return (ViewObjectImpl)findViewObject("BillingAddress");
    }

    /**
     * Container's getter for PaymentOptionsAddressesLink1.
     * @return PaymentOptionsAddressesLink1
     */
    public ViewLinkImpl getPaymentOptionsAddressesLink1() {
        return (ViewLinkImpl)findViewLink("PaymentOptionsAddressesLink1");
    }
}