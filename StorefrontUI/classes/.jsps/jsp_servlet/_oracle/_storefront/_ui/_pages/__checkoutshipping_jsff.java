package jsp_servlet._oracle._storefront._ui._pages;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __checkoutshipping_jsff extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/oracle/storefront/ui/pages/CheckoutShipping.jsff", 1222207340138L ,"10.3.0.0","America/Denver")) return true;
        return false;
    }

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final String _WL_ORIGINAL_ENCODING = "windows-1252".intern();

    private static byte[] _getBytes(String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/xml; charset=UTF-8");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter)out;
        bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;

            if (_jspx___tag0(request, response, pageContext, _activeTag, null))
             return;

            if (_jspx___tag1(request, response, pageContext, _activeTag, null))
             return;
        } catch (Throwable __ee){
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        }
    }

    private boolean _jspx___tag0(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.taglibs.standard.tag.rt.core.SetTag __tag0 = null ;
        int __result__tag0 = 0 ;

        if (__tag0 == null ){
            __tag0 = new  org.apache.taglibs.standard.tag.rt.core.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
        }
        __tag0.setPageContext(pageContext);
        __tag0.setParent(null);
        __tag0.setVar(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("storefrontuiBundle", java.lang.String .class));
        __tag0.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{adfBundle[\'oracle.storefront.ui.StorefrontUIBundle\']}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag0;
        __result__tag0 = __tag0.doStartTag();

        if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag0);
            return true;
        }
        _activeTag=__tag0.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
        __tag0.release();
        return false;
    }

    private boolean _jspx___tag1(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.taglib.region.PageTemplateTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  oracle.adfinternal.view.faces.taglib.region.PageTemplateTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        __tag1.setParent(null);
        __tag1.setJspId("id1");
        __tag1.setViewId( weblogic.servlet.jsp.ELHelper.createValueExpression("/oracle/storefront/ui/pages/templates/CheckoutPageTemplate.jspx",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag1.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag1.doInitBody();
                }
                do {

                    if (_jspx___tag2(request, response, pageContext, _activeTag, __tag1))
                     return true;

                    if (_jspx___tag22(request, response, pageContext, _activeTag, __tag1))
                     return true;
                } while (__tag1.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag1);
            return true;
        }
        _activeTag=__tag1.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
        __tag1.release();
        return false;
    }

    private boolean _jspx___tag2(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.taglib.region.PageTemplateTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        __tag2.setParent(parent);
        __tag2.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("content", java.lang.String .class));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {

                if (_jspx___tag3(request, response, pageContext, _activeTag, __tag2))
                 return true;
            } while (__tag2.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag2.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag2);
            return true;
        }
        _activeTag=__tag2.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag2);
        __tag2.release();
        return false;
    }

    private boolean _jspx___tag3(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.faces.webapp.FacetTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        __tag3.setParent(parent);
        __tag3.setJspId("id3");
        __tag3.setText( weblogic.servlet.jsp.ELHelper.createValueExpression("#{storefrontuiBundle.SHIPPING_ADDRESS}",java.lang.Object.class,pageContext, null ));
        __tag3.setInlineStyle( weblogic.servlet.jsp.ELHelper.createValueExpression("width:100%;",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag3;
        __result__tag3 = __tag3.doStartTag();

        if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag3.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag3.doInitBody();
                }
                do {

                    if (_jspx___tag4(request, response, pageContext, _activeTag, __tag3))
                     return true;

                    if (_jspx___tag5(request, response, pageContext, _activeTag, __tag3))
                     return true;

                    if (_jspx___tag6(request, response, pageContext, _activeTag, __tag3))
                     return true;

                    if (_jspx___tag7(request, response, pageContext, _activeTag, __tag3))
                     return true;

                    if (_jspx___tag8(request, response, pageContext, _activeTag, __tag3))
                     return true;

                    if (_jspx___tag9(request, response, pageContext, _activeTag, __tag3))
                     return true;
                } while (__tag3.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag3);
            return true;
        }
        _activeTag=__tag3.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
        __tag3.release();
        return false;
    }

    private boolean _jspx___tag4(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag4 = null ;
        int __result__tag4 = 0 ;

        if (__tag4 == null ){
            __tag4 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
        }
        __tag4.setPageContext(pageContext);
        __tag4.setParent(parent);
        __tag4.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("context", java.lang.String .class));
        _activeTag=__tag4;
        __result__tag4 = __tag4.doStartTag();

        if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag4.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag4);
            return true;
        }
        _activeTag=__tag4.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag4);
        __tag4.release();
        return false;
    }

    private boolean _jspx___tag5(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        __tag5.setParent(parent);
        __tag5.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("menuBar", java.lang.String .class));
        _activeTag=__tag5;
        __result__tag5 = __tag5.doStartTag();

        if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag5.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag5);
            return true;
        }
        _activeTag=__tag5.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag5);
        __tag5.release();
        return false;
    }

    private boolean _jspx___tag6(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag6 = null ;
        int __result__tag6 = 0 ;

        if (__tag6 == null ){
            __tag6 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
        }
        __tag6.setPageContext(pageContext);
        __tag6.setParent(parent);
        __tag6.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toolbar", java.lang.String .class));
        _activeTag=__tag6;
        __result__tag6 = __tag6.doStartTag();

        if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag6.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag6);
            return true;
        }
        _activeTag=__tag6.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag6);
        __tag6.release();
        return false;
    }

    private boolean _jspx___tag7(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag7 = null ;
        int __result__tag7 = 0 ;

        if (__tag7 == null ){
            __tag7 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
        }
        __tag7.setPageContext(pageContext);
        __tag7.setParent(parent);
        __tag7.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("legend", java.lang.String .class));
        _activeTag=__tag7;
        __result__tag7 = __tag7.doStartTag();

        if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag7.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag7);
            return true;
        }
        _activeTag=__tag7.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag7);
        __tag7.release();
        return false;
    }

    private boolean _jspx___tag8(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag8 = null ;
        int __result__tag8 = 0 ;

        if (__tag8 == null ){
            __tag8 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
        }
        __tag8.setPageContext(pageContext);
        __tag8.setParent(parent);
        __tag8.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("info", java.lang.String .class));
        _activeTag=__tag8;
        __result__tag8 = __tag8.doStartTag();

        if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag8.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag8);
            return true;
        }
        _activeTag=__tag8.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag8);
        __tag8.release();
        return false;
    }

    private boolean _jspx___tag9(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag __tag9 = null ;
        int __result__tag9 = 0 ;

        if (__tag9 == null ){
            __tag9 = new  oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
        }
        __tag9.setPageContext(pageContext);
        __tag9.setParent(parent);
        __tag9.setJspId("id9");
        _activeTag=__tag9;
        __result__tag9 = __tag9.doStartTag();

        if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag9.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag9.doInitBody();
                }
                do {

                    if (_jspx___tag10(request, response, pageContext, _activeTag, __tag9))
                     return true;

                    if (_jspx___tag12(request, response, pageContext, _activeTag, __tag9))
                     return true;

                    if (_jspx___tag14(request, response, pageContext, _activeTag, __tag9))
                     return true;

                    if (_jspx___tag16(request, response, pageContext, _activeTag, __tag9))
                     return true;

                    if (_jspx___tag18(request, response, pageContext, _activeTag, __tag9))
                     return true;

                    if (_jspx___tag20(request, response, pageContext, _activeTag, __tag9))
                     return true;
                } while (__tag9.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag9.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag9);
            return true;
        }
        _activeTag=__tag9.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag9);
        __tag9.release();
        return false;
    }

    private boolean _jspx___tag10(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        __tag10.setParent(parent);
        __tag10.setJspId("id10");
        __tag10.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.inputValue}",java.lang.Object.class,pageContext, null ));
        __tag10.setLabel( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.hints.label}",java.lang.Object.class,pageContext, null ));
        __tag10.setRequired( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.hints.mandatory}",boolean.class,pageContext, null ));
        __tag10.setColumns( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.hints.displayWidth}",int.class,pageContext, null ));
        __tag10.setMaximumLength( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.hints.precision}",int.class,pageContext, null ));
        __tag10.setShortDesc( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.hints.tooltip}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag10.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag10.doInitBody();
                }
                do {

                    if (_jspx___tag11(request, response, pageContext, _activeTag, __tag10))
                     return true;
                } while (__tag10.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag10.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag10);
            return true;
        }
        _activeTag=__tag10.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag10);
        __tag10.release();
        return false;
    }

    private boolean _jspx___tag11(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.ValidatorTag __tag11 = null ;
        int __result__tag11 = 0 ;

        if (__tag11 == null ){
            __tag11 = new  com.sun.faces.taglib.jsf_core.ValidatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
        }
        __tag11.setPageContext(pageContext);
        __tag11.setParent(parent);
        __tag11.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address1.validator}",javax.faces.validator.Validator.class,pageContext, null ));
        _activeTag=__tag11;
        __result__tag11 = __tag11.doStartTag();

        if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.sun.faces.taglib.jsf_core.ValidatorTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag11.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag11);
            return true;
        }
        _activeTag=__tag11.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag11);
        __tag11.release();
        return false;
    }

    private boolean _jspx___tag12(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag __tag12 = null ;
        int __result__tag12 = 0 ;

        if (__tag12 == null ){
            __tag12 = new  oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
        }
        __tag12.setPageContext(pageContext);
        __tag12.setParent(parent);
        __tag12.setJspId("id12");
        __tag12.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.inputValue}",java.lang.Object.class,pageContext, null ));
        __tag12.setLabel( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.hints.label}",java.lang.Object.class,pageContext, null ));
        __tag12.setRequired( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.hints.mandatory}",boolean.class,pageContext, null ));
        __tag12.setColumns( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.hints.displayWidth}",int.class,pageContext, null ));
        __tag12.setMaximumLength( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.hints.precision}",int.class,pageContext, null ));
        __tag12.setShortDesc( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.hints.tooltip}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag12;
        __result__tag12 = __tag12.doStartTag();

        if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag12.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag12.doInitBody();
                }
                do {

                    if (_jspx___tag13(request, response, pageContext, _activeTag, __tag12))
                     return true;
                } while (__tag12.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag12);
            return true;
        }
        _activeTag=__tag12.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
        __tag12.release();
        return false;
    }

    private boolean _jspx___tag13(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.ValidatorTag __tag13 = null ;
        int __result__tag13 = 0 ;

        if (__tag13 == null ){
            __tag13 = new  com.sun.faces.taglib.jsf_core.ValidatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
        }
        __tag13.setPageContext(pageContext);
        __tag13.setParent(parent);
        __tag13.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.Address2.validator}",javax.faces.validator.Validator.class,pageContext, null ));
        _activeTag=__tag13;
        __result__tag13 = __tag13.doStartTag();

        if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.sun.faces.taglib.jsf_core.ValidatorTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag13.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag13);
            return true;
        }
        _activeTag=__tag13.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag13);
        __tag13.release();
        return false;
    }

    private boolean _jspx___tag14(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag __tag14 = null ;
        int __result__tag14 = 0 ;

        if (__tag14 == null ){
            __tag14 = new  oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
        }
        __tag14.setPageContext(pageContext);
        __tag14.setParent(parent);
        __tag14.setJspId("id14");
        __tag14.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.inputValue}",java.lang.Object.class,pageContext, null ));
        __tag14.setLabel( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.hints.label}",java.lang.Object.class,pageContext, null ));
        __tag14.setRequired( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.hints.mandatory}",boolean.class,pageContext, null ));
        __tag14.setColumns( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.hints.displayWidth}",int.class,pageContext, null ));
        __tag14.setMaximumLength( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.hints.precision}",int.class,pageContext, null ));
        __tag14.setShortDesc( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.hints.tooltip}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag14;
        __result__tag14 = __tag14.doStartTag();

        if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag14.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag14.doInitBody();
                }
                do {

                    if (_jspx___tag15(request, response, pageContext, _activeTag, __tag14))
                     return true;
                } while (__tag14.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag14.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag14);
            return true;
        }
        _activeTag=__tag14.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag14);
        __tag14.release();
        return false;
    }

    private boolean _jspx___tag15(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.ValidatorTag __tag15 = null ;
        int __result__tag15 = 0 ;

        if (__tag15 == null ){
            __tag15 = new  com.sun.faces.taglib.jsf_core.ValidatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
        }
        __tag15.setPageContext(pageContext);
        __tag15.setParent(parent);
        __tag15.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.City.validator}",javax.faces.validator.Validator.class,pageContext, null ));
        _activeTag=__tag15;
        __result__tag15 = __tag15.doStartTag();

        if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.sun.faces.taglib.jsf_core.ValidatorTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag15.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag15);
            return true;
        }
        _activeTag=__tag15.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag15);
        __tag15.release();
        return false;
    }

    private boolean _jspx___tag16(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag __tag16 = null ;
        int __result__tag16 = 0 ;

        if (__tag16 == null ){
            __tag16 = new  oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag16);
        }
        __tag16.setPageContext(pageContext);
        __tag16.setParent(parent);
        __tag16.setJspId("id16");
        __tag16.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.inputValue}",java.lang.Object.class,pageContext, null ));
        __tag16.setLabel( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.hints.label}",java.lang.Object.class,pageContext, null ));
        __tag16.setRequired( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.hints.mandatory}",boolean.class,pageContext, null ));
        __tag16.setColumns( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.hints.displayWidth}",int.class,pageContext, null ));
        __tag16.setMaximumLength( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.hints.precision}",int.class,pageContext, null ));
        __tag16.setShortDesc( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.hints.tooltip}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag16;
        __result__tag16 = __tag16.doStartTag();

        if (__result__tag16!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag16.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag16.doInitBody();
                }
                do {

                    if (_jspx___tag17(request, response, pageContext, _activeTag, __tag16))
                     return true;
                } while (__tag16.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag16.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag16);
            return true;
        }
        _activeTag=__tag16.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag16);
        __tag16.release();
        return false;
    }

    private boolean _jspx___tag17(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.ValidatorTag __tag17 = null ;
        int __result__tag17 = 0 ;

        if (__tag17 == null ){
            __tag17 = new  com.sun.faces.taglib.jsf_core.ValidatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag17);
        }
        __tag17.setPageContext(pageContext);
        __tag17.setParent(parent);
        __tag17.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.StateProvince.validator}",javax.faces.validator.Validator.class,pageContext, null ));
        _activeTag=__tag17;
        __result__tag17 = __tag17.doStartTag();

        if (__result__tag17!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag17== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.sun.faces.taglib.jsf_core.ValidatorTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag17.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag17);
            return true;
        }
        _activeTag=__tag17.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag17);
        __tag17.release();
        return false;
    }

    private boolean _jspx___tag18(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag __tag18 = null ;
        int __result__tag18 = 0 ;

        if (__tag18 == null ){
            __tag18 = new  oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
        }
        __tag18.setPageContext(pageContext);
        __tag18.setParent(parent);
        __tag18.setJspId("id18");
        __tag18.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.inputValue}",java.lang.Object.class,pageContext, null ));
        __tag18.setLabel( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.hints.label}",java.lang.Object.class,pageContext, null ));
        __tag18.setRequired( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.hints.mandatory}",boolean.class,pageContext, null ));
        __tag18.setColumns( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.hints.displayWidth}",int.class,pageContext, null ));
        __tag18.setMaximumLength( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.hints.precision}",int.class,pageContext, null ));
        __tag18.setShortDesc( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.hints.tooltip}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag18;
        __result__tag18 = __tag18.doStartTag();

        if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag18.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag18.doInitBody();
                }
                do {

                    if (_jspx___tag19(request, response, pageContext, _activeTag, __tag18))
                     return true;
                } while (__tag18.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag18.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag18);
            return true;
        }
        _activeTag=__tag18.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag18);
        __tag18.release();
        return false;
    }

    private boolean _jspx___tag19(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.ValidatorTag __tag19 = null ;
        int __result__tag19 = 0 ;

        if (__tag19 == null ){
            __tag19 = new  com.sun.faces.taglib.jsf_core.ValidatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag19);
        }
        __tag19.setPageContext(pageContext);
        __tag19.setParent(parent);
        __tag19.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.PostalCode.validator}",javax.faces.validator.Validator.class,pageContext, null ));
        _activeTag=__tag19;
        __result__tag19 = __tag19.doStartTag();

        if (__result__tag19!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag19== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.sun.faces.taglib.jsf_core.ValidatorTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag19.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag19);
            return true;
        }
        _activeTag=__tag19.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag19);
        __tag19.release();
        return false;
    }

    private boolean _jspx___tag20(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelFormLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.input.UnifiedSelectOneChoiceTag __tag20 = null ;
        int __result__tag20 = 0 ;

        if (__tag20 == null ){
            __tag20 = new  oracle.adfinternal.view.faces.unified.taglib.input.UnifiedSelectOneChoiceTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag20);
        }
        __tag20.setPageContext(pageContext);
        __tag20.setParent(parent);
        __tag20.setJspId("id20");
        __tag20.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.CountryId.inputValue}",java.lang.Object.class,pageContext, null ));
        __tag20.setLabel( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.CountryId.label}",java.lang.Object.class,pageContext, null ));
        __tag20.setRequired( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.CountryId.hints.mandatory}",boolean.class,pageContext, null ));
        __tag20.setShortDesc( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.CountryId.hints.tooltip}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag20;
        __result__tag20 = __tag20.doStartTag();

        if (__result__tag20!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag20.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag20.doInitBody();
                }
                do {

                    if (_jspx___tag21(request, response, pageContext, _activeTag, __tag20))
                     return true;
                } while (__tag20.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag20.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag20);
            return true;
        }
        _activeTag=__tag20.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag20);
        __tag20.release();
        return false;
    }

    private boolean _jspx___tag21(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.input.UnifiedSelectOneChoiceTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.SelectItemsTag __tag21 = null ;
        int __result__tag21 = 0 ;

        if (__tag21 == null ){
            __tag21 = new  com.sun.faces.taglib.jsf_core.SelectItemsTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
        }
        __tag21.setPageContext(pageContext);
        __tag21.setParent(parent);
        __tag21.setJspId("id21");
        __tag21.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.CountryId.items}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag21;
        __result__tag21 = __tag21.doStartTag();

        if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag21.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag21);
            return true;
        }
        _activeTag=__tag21.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag21);
        __tag21.release();
        return false;
    }

    private boolean _jspx___tag22(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.taglib.region.PageTemplateTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.sun.faces.taglib.jsf_core.AttributeTag __tag22 = null ;
        int __result__tag22 = 0 ;

        if (__tag22 == null ){
            __tag22 = new  com.sun.faces.taglib.jsf_core.AttributeTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
        }
        __tag22.setPageContext(pageContext);
        __tag22.setParent(parent);
        __tag22.setName( weblogic.servlet.jsp.ELHelper.createValueExpression("title",java.lang.String.class,pageContext, null ));
        __tag22.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{storefrontuiBundle.SHIPPING}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag22;
        __result__tag22 = __tag22.doStartTag();

        if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.sun.faces.taglib.jsf_core.AttributeTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag22.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag22);
            return true;
        }
        _activeTag=__tag22.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
        __tag22.release();
        return false;
    }
}
