package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChangeMobileNo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("   <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <title>foxy - free web template</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\" />\n");
      out.write("       \n");
      out.write("         <link rel=\"stylesheet\" href=\"css/validationEngine.jquery.css\" type=\"text/css\"/>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\" type=\"text/javascript\">\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.validationEngine-en.js\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.validationEngine.js\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t</script>\n");
      out.write("         <script>\n");
      out.write("             \n");
      out.write("\t\tjQuery(document).ready(function(){\n");
      out.write("\t\t\t// binds form submission and fields to the validation engine\n");
      out.write("\t\t\tjQuery(\"#formID\").validationEngine();\n");
      out.write("\t\t});\n");
      out.write("         </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"innerheader\">\n");
      out.write("                    <div id=\"title\">\n");
      out.write("                        <h1>UNOPASS</h1>\n");
      out.write("                        <h2></h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <div id=\"page\">\n");
      out.write("                    <div class=\"innerpage\">\n");
      out.write("\n");
      out.write("                        <h2>Change Password</h2>\n");
      out.write("                        <p>\n");
      out.write("                           \n");
      out.write("                                 <form action=\"ChangeMobileNoAction.jsp\" id=\"formID\" class=\"formular\" method=\"post\">\n");
      out.write("                              \n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            Current Password:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input value=\"\" class=\"validate[required] text-input\" type=\"text\" name=\"pass1\" id=\"pass1\" />\n");
      out.write("\t\t    \n");
      out.write("                                          \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            MobileNo:\n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input value=\"\" maxlength=\"10\" class=\"validate[required,custom[integer],Size equals[10]] text-input\" type=\"password\" name=\"nmob\" id=\"nmob\" />                                         \n");
      out.write("                                           \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            Confirm Mobile No:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            \n");
      out.write("                                            <input value=\"\" class=\"validate[required,equals[nmob]] text-input\" type=\"password\" name=\"cmob\" id=\"cmob\" />\n");
      out.write("\t\t\t\n");
      out.write("                                              </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"submit\" value=\"Change\" style=\"background: red;font-weight: bolder\" onclick=\"return val()\"></input>\n");
      out.write("                                            <input type=\"reset\" value=\"Clear\" style=\"background: red;font-weight: bolder\"></input>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"color: green\" >\n");
      out.write("                                            ");

                                            String s=request.getParameter("f");
                                            if(s!=null)
                                                {
                                                if(s.equals("1"))
                                                    {
                                                    out.print("MobileNo changed  succefully");

                                                }

                                                else
                                                    {
                                                        out.print("MobileNo not changed");
                                                    }

                                               }

                                            
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p></p>\n");
      out.write("                        <ul>\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p></p>\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p><a href=\"\"></a> </p>\n");
      out.write("                        <h3></h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"sidebar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"UserHome.jsp\" >Home</a></li>\n");
      out.write("                        <li><a href=\"ChangePassword.jsp\" >Change Password</a></li>\n");
      out.write("                        <li><a href=\"ChangeMobileNo.jsp\" class=\"selected\" >changeMobile No</a></li>\n");
      out.write("                            <li><a href=\"Download.jsp\" >DownLoad</a></li>\n");
      out.write("   <li><a href=\"Profile.jsp\" >Profile view&edit</a></li>\n");
      out.write("      <li><a href=\"Logout.jsp\" >Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
