package oracle.storefront.ui.bean;

import oracle.storefront.ui.common.ADFUtil;

public class FODShoppingDashboardBean {
    public FODShoppingDashboardBean() {
    }
    
    /**
     * Used as a consumer to a contextual event, changes the 
     * parameter values passed to the local area region and forces 
     * a refresh in that area. 
     * 
     * @param category Selected category
     */
        public void refreshCategory(FODCategoryBean category) {
            /*
             * For the selected category, set requestScope 
             * variables.
             * These variables are used as parameters to the local
             * area region.
             */
            ADFUtil.setEL("#{requestScope.CategoryId}",
                          category.getCategoryId());
            ADFUtil.setEL("#{requestScope.SubCategoryId}",
                          category.getSubCategoryId());
            ADFUtil.setEL("#{requestScope.CategoryName}",
                          category.getCategoryName());
            ADFUtil.setEL("#{requestScope.SubCategoryName}",
                          category.getSubCategoryName());
            
    /** #{requestScope.refreshLocalArea} is used as the EL to 
     *  control whether the local area region is refreshed. By 
     *  setting this to true, the region will be forced to refresh 
     *  with the new category. 
     */
            ADFUtil.setEL("#{requestScope.refreshLocalArea}", 
                           Boolean.TRUE);
        }

}
