package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mtech.db.DBConnection;;

public final class ProfileAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

String un=session.getAttribute("uname").toString();
 String mob= request.getParameter("mob");
            String fn = request.getParameter("fname");
            String ln = request.getParameter("lname");
            String gen = request.getParameter("sex");
            String dob = request.getParameter("dob");
            String ph = request.getParameter("txtphone");
            String amob = request.getParameter("txtmobile");
            String em = request.getParameter("txtemail");
            String street = request.getParameter("txtstreet");
             String city = request.getParameter("txtcity");
            String zip = request.getParameter("txtzip");
            String state = request.getParameter("txtstate");
            String country = request.getParameter("txtcountry");
            String sql="update register set fname='"+fn+"',lname='"+ln+"',gender='"+gen+"',dob='"+dob+"',phone='"+dob+"',altmob='"+amob+"',email='"+em+"',streetname='"+street+"',city='"+city+"',zip='"+zip+"',state='"+state+"',country='"+country+"' where username='"+un+"'";
            int i=new DBConnection().putData(sql);
            if(i>0)
                {
                out.print("success");
                }
            else
                {
                out.print("failed");
                }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
