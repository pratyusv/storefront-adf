package oracle.fod.storefront.test;
import oracle.jbo.client.Configuration;
import oracle.jbo.*;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.*;

public class StorefrontTest {
    public static void main(String[] args) {
        String amDef = "oracle.fod.storefront.test.TestAM";
        String config = "TestAMLocal";
        ApplicationModule am =
            Configuration.createRootApplicationModule(amDef, config);
        ViewObject vo = am.findViewObject("PaymentOptionV1");
         // Work with your appmodule and view object here
         System.out.println("The table contains " +  vo.getEstimatedRowCount() + " rows:");
         vo.executeQuery();
         while (vo.hasNext()){
             Row paymentOptionRow = vo.next();
             System.out.println("  CustomerID: " + 
                                paymentOptionRow.getAttribute("CustomerId") + 
                                " Payment Type Code: " + 
                                paymentOptionRow.getAttribute("PaymentTypeCode"));
         }
        Configuration.releaseRootApplicationModule(am, true);
    }
}
