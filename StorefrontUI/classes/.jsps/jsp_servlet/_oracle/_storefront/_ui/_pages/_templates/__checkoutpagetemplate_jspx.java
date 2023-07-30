package jsp_servlet._oracle._storefront._ui._pages._templates;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __checkoutpagetemplate_jspx extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/oracle/storefront/ui/pages/templates/CheckoutPageTemplate.jspx", 1222207340809L ,"10.3.0.0","America/Denver")) return true;
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

    private final static String  _wl_block0 ="<component xmlns=\"http://xmlns.oracle.com/adf/faces/rich/component\">";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private final static String  _wl_block1 ="<display-name>";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private final static String  _wl_block2 ="CheckoutPageTemplate";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private final static String  _wl_block3 ="</display-name>";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private final static String  _wl_block4 ="<facet>";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private final static String  _wl_block5 ="<facet-name>";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private final static String  _wl_block6 ="content";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private final static String  _wl_block7 ="</facet-name>";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private final static String  _wl_block8 ="</facet>";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private final static String  _wl_block9 ="<attribute>";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private final static String  _wl_block10 ="<attribute-name>";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private final static String  _wl_block11 ="title";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private final static String  _wl_block12 ="</attribute-name>";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private final static String  _wl_block13 ="<attribute-class>";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private final static String  _wl_block14 ="java.lang.String";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private final static String  _wl_block15 ="</attribute-class>";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private final static String  _wl_block16 ="<required>";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private final static String  _wl_block17 ="true";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private final static String  _wl_block18 ="</required>";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private final static String  _wl_block19 ="</attribute>";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private final static String  _wl_block20 ="</component>";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html;charset=windows-1252");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter)out;
        bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html;charset=windows-1252");

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
         oracle.adfinternal.view.faces.taglib.region.PageTemplateDefTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  oracle.adfinternal.view.faces.taglib.region.PageTemplateDefTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        __tag1.setParent(null);
        __tag1.setVar(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("attrs", java.lang.String .class));
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class oracle.adfinternal.view.faces.taglib.region.PageTemplateDefTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {

                if (_jspx___tag2(request, response, pageContext, _activeTag, __tag1))
                 return true;

                if (_jspx___tag15(request, response, pageContext, _activeTag, __tag1))
                 return true;
            } while (__tag1.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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

    private boolean _jspx___tag2(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.taglib.region.PageTemplateDefTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        __tag2.setParent(parent);
        __tag2.setJspId("id2");
        __tag2.setLayout( weblogic.servlet.jsp.ELHelper.createValueExpression("scroll",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag2.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag2.doInitBody();
                }
                do {

                    if (_jspx___tag3(request, response, pageContext, _activeTag, __tag2))
                     return true;

                    if (_jspx___tag4(request, response, pageContext, _activeTag, __tag2))
                     return true;
                } while (__tag2.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
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

    private boolean _jspx___tag3(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedTrainTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedTrainTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        __tag3.setParent(parent);
        __tag3.setJspId("id3");
        __tag3.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{controllerContext.currentViewPort.taskFlowContext.trainModel}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag3;
        __result__tag3 = __tag3.doStartTag();

        if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jspx___tag4(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag __tag4 = null ;
        int __result__tag4 = 0 ;

        if (__tag4 == null ){
            __tag4 = new  oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
        }
        __tag4.setPageContext(pageContext);
        __tag4.setParent(parent);
        __tag4.setJspId("id4");
        __tag4.setText( weblogic.servlet.jsp.ELHelper.createValueExpression("#{attrs.title}",java.lang.Object.class,pageContext, null ));
        __tag4.setInlineStyle( weblogic.servlet.jsp.ELHelper.createValueExpression("width:100%;",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag4;
        __result__tag4 = __tag4.doStartTag();

        if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag4.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag4.doInitBody();
                }
                do {

                    if (_jspx___tag5(request, response, pageContext, _activeTag, __tag4))
                     return true;

                    if (_jspx___tag6(request, response, pageContext, _activeTag, __tag4))
                     return true;

                    if (_jspx___tag7(request, response, pageContext, _activeTag, __tag4))
                     return true;

                    if (_jspx___tag12(request, response, pageContext, _activeTag, __tag4))
                     return true;

                    if (_jspx___tag13(request, response, pageContext, _activeTag, __tag4))
                     return true;

                    if (_jspx___tag14(request, response, pageContext, _activeTag, __tag4))
                     return true;
                } while (__tag4.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
        __tag5.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("context", java.lang.String .class));
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
        __tag6.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("menuBar", java.lang.String .class));
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
        __tag7.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toolbar", java.lang.String .class));
        _activeTag=__tag7;
        __result__tag7 = __tag7.doStartTag();

        if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {

                if (_jspx___tag8(request, response, pageContext, _activeTag, __tag7))
                 return true;
            } while (__tag7.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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

    private boolean _jspx___tag8(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.faces.webapp.FacetTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag __tag8 = null ;
        int __result__tag8 = 0 ;

        if (__tag8 == null ){
            __tag8 = new  oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
        }
        __tag8.setPageContext(pageContext);
        __tag8.setParent(parent);
        __tag8.setJspId("id8");
        _activeTag=__tag8;
        __result__tag8 = __tag8.doStartTag();

        if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag8.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag8.doInitBody();
                }
                do {

                    if (_jspx___tag9(request, response, pageContext, _activeTag, __tag8))
                     return true;

                    if (_jspx___tag10(request, response, pageContext, _activeTag, __tag8))
                     return true;

                    if (_jspx___tag11(request, response, pageContext, _activeTag, __tag8))
                     return true;
                } while (__tag8.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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

    private boolean _jspx___tag9(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag __tag9 = null ;
        int __result__tag9 = 0 ;

        if (__tag9 == null ){
            __tag9 = new  oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
        }
        __tag9.setPageContext(pageContext);
        __tag9.setParent(parent);
        __tag9.setJspId("id9");
        __tag9.setText( weblogic.servlet.jsp.ELHelper.createValueExpression("#{storefrontuiBundle.CANCEL}",java.lang.Object.class,pageContext, null ));
        __tag9.setAction( weblogic.servlet.jsp.ELHelper.createMethodExpression("cancel",java.lang.String.class,new Class[]{},pageContext, null ));
        __tag9.setImmediate( weblogic.servlet.jsp.ELHelper.createValueExpression("true",boolean.class,pageContext, null ));
        _activeTag=__tag9;
        __result__tag9 = __tag9.doStartTag();

        if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jspx___tag10(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedTrainButtonBarTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedTrainButtonBarTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        __tag10.setParent(parent);
        __tag10.setJspId("id10");
        __tag10.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{ controllerContext.currentViewPort.taskFlowContext.trainModel}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jspx___tag11(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag __tag11 = null ;
        int __result__tag11 = 0 ;

        if (__tag11 == null ){
            __tag11 = new  oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
        }
        __tag11.setPageContext(pageContext);
        __tag11.setParent(parent);
        __tag11.setJspId("id11");
        __tag11.setText( weblogic.servlet.jsp.ELHelper.createValueExpression("#{storefrontuiBundle.SUBMIT}",java.lang.Object.class,pageContext, null ));
        __tag11.setAction( weblogic.servlet.jsp.ELHelper.createMethodExpression("submit",java.lang.String.class,new Class[]{},pageContext, null ));
        __tag11.setDisabled( weblogic.servlet.jsp.ELHelper.createValueExpression("#{controllerContext.currentViewPort.taskFlowContext.trainModel.next != null}",boolean.class,pageContext, null ));
        _activeTag=__tag11;
        __result__tag11 = __tag11.doStartTag();

        if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jspx___tag12(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag12 = null ;
        int __result__tag12 = 0 ;

        if (__tag12 == null ){
            __tag12 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
        }
        __tag12.setPageContext(pageContext);
        __tag12.setParent(parent);
        __tag12.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("legend", java.lang.String .class));
        _activeTag=__tag12;
        __result__tag12 = __tag12.doStartTag();

        if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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

    private boolean _jspx___tag13(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         javax.faces.webapp.FacetTag __tag13 = null ;
        int __result__tag13 = 0 ;

        if (__tag13 == null ){
            __tag13 = new  javax.faces.webapp.FacetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
        }
        __tag13.setPageContext(pageContext);
        __tag13.setParent(parent);
        __tag13.setName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("info", java.lang.String .class));
        _activeTag=__tag13;
        __result__tag13 = __tag13.doStartTag();

        if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class javax.faces.webapp.FacetTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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

    private boolean _jspx___tag14(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelHeaderTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.taglib.region.FacetRefTag __tag14 = null ;
        int __result__tag14 = 0 ;

        if (__tag14 == null ){
            __tag14 = new  oracle.adfinternal.view.faces.taglib.region.FacetRefTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
        }
        __tag14.setPageContext(pageContext);
        __tag14.setParent(parent);
        __tag14.setJspId("id14");
        __tag14.setFacetName(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("content", java.lang.String .class));
        _activeTag=__tag14;
        __result__tag14 = __tag14.doStartTag();

        if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jspx___tag15(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.taglib.region.PageTemplateDefTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.taglib.region.XmlContentTag __tag15 = null ;
        int __result__tag15 = 0 ;

        if (__tag15 == null ){
            __tag15 = new  oracle.adfinternal.view.faces.taglib.region.XmlContentTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
        }
        __tag15.setPageContext(pageContext);
        __tag15.setParent(parent);
        _activeTag=__tag15;
        __result__tag15 = __tag15.doStartTag();

        if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag15.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag15.doInitBody();
                }
                do {
                    bw.write(_wl_block0Bytes, _wl_block0);
                    bw.write(_wl_block1Bytes, _wl_block1);
                    bw.write(_wl_block2Bytes, _wl_block2);
                    bw.write(_wl_block3Bytes, _wl_block3);
                    bw.write(_wl_block4Bytes, _wl_block4);
                    bw.write(_wl_block5Bytes, _wl_block5);
                    bw.write(_wl_block6Bytes, _wl_block6);
                    bw.write(_wl_block7Bytes, _wl_block7);
                    bw.write(_wl_block8Bytes, _wl_block8);
                    bw.write(_wl_block9Bytes, _wl_block9);
                    bw.write(_wl_block10Bytes, _wl_block10);
                    bw.write(_wl_block11Bytes, _wl_block11);
                    bw.write(_wl_block12Bytes, _wl_block12);
                    bw.write(_wl_block13Bytes, _wl_block13);
                    bw.write(_wl_block14Bytes, _wl_block14);
                    bw.write(_wl_block15Bytes, _wl_block15);
                    bw.write(_wl_block16Bytes, _wl_block16);
                    bw.write(_wl_block17Bytes, _wl_block17);
                    bw.write(_wl_block18Bytes, _wl_block18);
                    bw.write(_wl_block19Bytes, _wl_block19);
                    bw.write(_wl_block20Bytes, _wl_block20);
                } while (__tag15.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
}
