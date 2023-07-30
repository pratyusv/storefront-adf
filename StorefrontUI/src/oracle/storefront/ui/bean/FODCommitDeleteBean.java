package oracle.storefront.ui.bean;

import javax.faces.event.ActionEvent;

import oracle.storefront.ui.common.ADFUtil;

public class FODCommitDeleteBean {
    public FODCommitDeleteBean() {
    }
    /**
         * Deletes the current selected row in the Shopping Cart.
         * 
         * @param actionEvent 
         */
        
    public void onDeleteItem(ActionEvent actionEvent) {
            ADFUtil.invokeEL("#{bindings.Delete.execute}");
            ADFUtil.invokeEL("#{bindings.Commit.execute}");
            System.out.println("Deleted");
        }

}
