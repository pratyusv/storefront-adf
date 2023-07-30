package oracle.fod.storefront.test;

import oracle.fod.storefront.module.BaseApplicationModuleImpl;

import oracle.fod.storefront.test.common.TestAM;

import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 18 14:11:09 MDT 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TestAMImpl extends BaseApplicationModuleImpl implements TestAM {
    /**
     * This is the default constructor (do not remove).
     */
    public TestAMImpl() {
    }

    /**
     * Container's getter for ShoppingCartItem1.
     * @return ShoppingCartItem1
     */
    public ViewObjectImpl getShoppingCartItem1() {
        return (ViewObjectImpl)findViewObject("ShoppingCartItem1");
    }

    /**
     * Container's getter for ShoppingCart1.
     * @return ShoppingCart1
     */
    public ViewObjectImpl getShoppingCart1() {
        return (ViewObjectImpl)findViewObject("ShoppingCart1");
    }

    /**
     * Container's getter for ShoppingCartItem2.
     * @return ShoppingCartItem2
     */
    public ViewObjectImpl getShoppingCartItem2() {
        return (ViewObjectImpl)findViewObject("ShoppingCartItem2");
    }

    /**
     * Container's getter for LookupCodeV1.
     * @return LookupCodeV1
     */
    public ViewObjectImpl getLookupCodeV1() {
        return (ViewObjectImpl)findViewObject("LookupCodeV1");
    }

    /**
     * Container's getter for CountryV1.
     * @return CountryV1
     */
    public ViewObjectImpl getCountryV1() {
        return (ViewObjectImpl)findViewObject("CountryV1");
    }

    /**
     * Container's getter for CustomerV1.
     * @return CustomerV1
     */
    public ViewObjectImpl getCustomerV1() {
        return (ViewObjectImpl)findViewObject("CustomerV1");
    }

    /**
     * Container's getter for PaymentOptionV1.
     * @return PaymentOptionV1
     */
    public ViewObjectImpl getPaymentOptionV1() {
        return (ViewObjectImpl)findViewObject("PaymentOptionV1");
    }

    /**
     * Container's getter for ProductV1.
     * @return ProductV1
     */
    public ViewObjectImpl getProductV1() {
        return (ViewObjectImpl)findViewObject("ProductV1");
    }

    /**
     * Container's getter for WarehouseV1.
     * @return WarehouseV1
     */
    public ViewObjectImpl getWarehouseV1() {
        return (ViewObjectImpl)findViewObject("WarehouseV1");
    }

    /**
     * Container's getter for PaymentOptionV2.
     * @return PaymentOptionV2
     */
    public ViewObjectImpl getPaymentOptionV2() {
        return (ViewObjectImpl)findViewObject("PaymentOptionV2");
    }

    /**
     * Container's getter for RootCategory1.
     * @return RootCategory1
     */
    public ViewObjectImpl getRootCategory1() {
        return (ViewObjectImpl)findViewObject("RootCategory1");
    }

    /**
     * Container's getter for SubCategory1.
     * @return SubCategory1
     */
    public ViewObjectImpl getSubCategory1() {
        return (ViewObjectImpl)findViewObject("SubCategory1");
    }

    /**
     * Container's getter for RootCategory2.
     * @return RootCategory2
     */
    public ViewObjectImpl getRootCategory2() {
        return (ViewObjectImpl)findViewObject("RootCategory2");
    }

    /**
     * Container's getter for SubCategory2.
     * @return SubCategory2
     */
    public ViewObjectImpl getSubCategory2() {
        return (ViewObjectImpl)findViewObject("SubCategory2");
    }

    /**
     * Container's getter for Supplier1.
     * @return Supplier1
     */
    public ViewObjectImpl getSupplier1() {
        return (ViewObjectImpl)findViewObject("Supplier1");
    }

    /**
     * Container's getter for AddressVO1.
     * @return AddressVO1
     */
    public ViewObjectImpl getAddressVO1() {
        return (ViewObjectImpl)findViewObject("AddressVO1");
    }

    /**
     * Container's getter for PaymentOptionVO1.
     * @return PaymentOptionVO1
     */
    public ViewObjectImpl getPaymentOptionVO1() {
        return (ViewObjectImpl)findViewObject("PaymentOptionVO1");
    }

    /**
     * Container's getter for AddressVO2.
     * @return AddressVO2
     */
    public ViewObjectImpl getAddressVO2() {
        return (ViewObjectImpl)findViewObject("AddressVO2");
    }

    /**
     * Container's getter for ProductVO1.
     * @return ProductVO1
     */
    public ViewObjectImpl getProductVO1() {
        return (ViewObjectImpl)findViewObject("ProductVO1");
    }

    /**
     * Container's getter for AddressVO3.
     * @return AddressVO3
     */
    public ViewObjectImpl getAddressVO3() {
        return (ViewObjectImpl)findViewObject("AddressVO3");
    }

    /**
     * Container's getter for OrderItemsOrdersFkLink1.
     * @return OrderItemsOrdersFkLink1
     */
    public ViewLinkImpl getOrderItemsOrdersFkLink1() {
        return (ViewLinkImpl)findViewLink("OrderItemsOrdersFkLink1");
    }

    /**
     * Container's getter for PaymentOptionsPersonsFkLink1.
     * @return PaymentOptionsPersonsFkLink1
     */
    public ViewLinkImpl getPaymentOptionsPersonsFkLink1() {
        return (ViewLinkImpl)findViewLink("PaymentOptionsPersonsFkLink1");
    }

    /**
     * Container's getter for RootCategoriesSubCategoriesLink.
     * @return RootCategoriesSubCategoriesLink
     */
    public ViewLinkImpl getRootCategoriesSubCategoriesLink() {
        return (ViewLinkImpl)findViewLink("RootCategoriesSubCategoriesLink");
    }

    /**
     * Container's getter for ShoppingCartAddressesLink1.
     * @return ShoppingCartAddressesLink1
     */
    public ViewLinkImpl getShoppingCartAddressesLink1() {
        return (ViewLinkImpl)findViewLink("ShoppingCartAddressesLink1");
    }

    /**
     * Container's getter for ShoppingCartPaymentOptionsLink1.
     * @return ShoppingCartPaymentOptionsLink1
     */
    public ViewLinkImpl getShoppingCartPaymentOptionsLink1() {
        return (ViewLinkImpl)findViewLink("ShoppingCartPaymentOptionsLink1");
    }

    /**
     * Container's getter for PaymentOptionsAddressesLink1.
     * @return PaymentOptionsAddressesLink1
     */
    public ViewLinkImpl getPaymentOptionsAddressesLink1() {
        return (ViewLinkImpl)findViewLink("PaymentOptionsAddressesLink1");
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
}
