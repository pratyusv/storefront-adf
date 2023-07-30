package oracle.fod.storefront.entity;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;

public class BaseEntityImpl extends EntityImpl {
    public BaseEntityImpl() {
    }


    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
            /* HACK: the following is a hack to
             * circumvent the created-by/last-updated-by defaulting of OAEntityImpl
             */
            switch (attr.getHistoryKind()) {
            case AttributeDefImpl.HISTORY_CREATE_USER:
            case AttributeDefImpl.HISTORY_MODIFY_USER:
                return "anonymous";
            }
            return super.getHistoryContextForAttribute(attr);
        }

}
