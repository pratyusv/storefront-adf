package oracle.storefront.ui.bean;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import oracle.storefront.ui.common.ADFUtil;
import oracle.jbo.domain.Number;

public class FODCategoryBean {
    private Number categoryId, subCategoryId;
    private String categoryName, subCategoryName;

    public FODCategoryBean() {
    }

    public void setCategoryId(Number categoryId) {
        this.categoryId = categoryId;
    }

    public Number getCategoryId() {
        return categoryId;
    }

    public void setSubCategoryId(Number subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Number getSubCategoryId() {
        return subCategoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }
    
    /**
     * Evaluates the currently selected node in the tree returns a 
     * bean representing that node.
     * 
     * @return FODCategoryBean with all properties set
     */
        public FODCategoryBean onNodeClicked() {
            JUCtrlHierNodeBinding node =
                (JUCtrlHierNodeBinding)ADFUtil.evaluateEL("#{node}");
            Row nodeRow = node.getRow();

            JUCtrlHierNodeBinding parentNode = node.getParent();
            Row parentRow = parentNode.getRow();

            Number categoryId, subCategoryId;
            String categoryName, subCategoryName;
            if (parentRow == null) {
              // Root category selected
                categoryId =
                     (Number)nodeRow.getAttribute("CategoryId");
                categoryName =
                     (String)nodeRow.getAttribute("CategoryName");
                subCategoryId = null;
                subCategoryName = null;
            } else {
                // Sub-category selected
                categoryId =
                   (Number)parentRow.getAttribute("CategoryId");
                categoryName = 
                   (String)parentRow.getAttribute("CategoryName");
                subCategoryId =
                   (Number)nodeRow.getAttribute("CategoryId");
                subCategoryName =
                   (String)nodeRow.getAttribute("CategoryName");
            }

            setCategoryId(categoryId);
            setSubCategoryId(subCategoryId);
            setCategoryName(categoryName);
            setSubCategoryName(subCategoryName);

            return this;
            }

}
