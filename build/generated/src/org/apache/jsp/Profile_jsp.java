package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mtech.db.DBConnection;
import java.sql.ResultSet;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ResultSet rs;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <title>UNOPASS</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\" />\n");
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
      out.write("                        <h2>Profile</h2>\n");
      out.write("                        <p>\n");
      out.write("                            <form action=\"ProfileAction.jsp\" method=\"post\">\n");
      out.write("                                <table>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    ");

                                                try {
                                                    String s = session.getAttribute("uname").toString();
                                                    String sql = "select * from register where username='" + s + "'";
                                                    rs = new DBConnection().getData(sql);
                                                    if (rs.next()) {

                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h3> Personal Details</h3>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>First Name:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"fname\" id=\"txtfirstname\" value=\"");
      out.print( rs.getString("fname"));
      out.write("\"/></td></tr><tr> <td>LastName</td><td><input type=\"text\" name=\"LastName\" id=\"LastName\" value=\"");
      out.print( rs.getString("lname"));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <  <td>Gender:</td>\n");
      out.write("                                        <td colspan=\"2\">\n");
      out.write("                                            <input type=\"radio\" name=\"sex\" id=\"sex\" value=\"male\" ");
 if (rs.getString("gender").equals("male")) {
      out.write(" checked=\"true\" ");
 }
      out.write("/> Male\n");
      out.write("                                            <input type=\"radio\" name=\"sex\" id=\"sex\" value=\"female\" ");
 if (rs.getString("gender").equals("female")) {
      out.write(" checked=\"true\" ");
 }
      out.write("/> Female\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Date of Birth: </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"Text\" name=\"dob\" id=\"dob\" value=\"");
      out.print( rs.getString("dob"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Phone:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtphone\" id=\"txtphone\" value=\"");
      out.print( rs.getString("phone"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Alternate Mobile No:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtmobile\" id=\"txtmobile\" value=\"");
      out.print( rs.getString("altmob"));
      out.write("\"/>\n");
      out.write("                                        </td>                  </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>EMail:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtemail\" id=\"txtemail\" value=\"");
      out.print( rs.getString("email"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h3>\n");
      out.write("                                                Address\n");
      out.write("                                            </h3>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Street name:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtstreetname\" id=\"txtstreetname\" value=\"");
      out.print( rs.getString("streetname"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>City:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtcity\" id=\"txtcity\" value=\"");
      out.print( rs.getString("city"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>ZIP:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtzip\" id=\"txtzip\" value=\"");
      out.print( rs.getString("zip"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>State:</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"txtstate\" id=\"txtstate\" value=\"");
      out.print( rs.getString("state"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Country:</td>\n");
      out.write("                                        <td ><input type=\"text\" name=\"txtcountry\" id=\"txtcountry\" value=\"");
      out.print( rs.getString("country"));
      out.write("\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                                    }
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                                        <td> <input type=\"submit\" value=\"Update\" style=\"font: bolder;background: red\"></input><input type=\"reset\" value=\"Reset\" style=\"font: bolder;background: red\"></input></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("\n");
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
      out.write("                        <li><a href=\"UserHome.jsp\" class=\"selected\">Home</a></li>\n");
      out.write("                        <li><a href=\"ChangePassword.jsp\">Change Password</a></li>\n");
      out.write("                        <li><a href=\"ChangeMobileNo.jsp\" >changeMobile No</a></li>\n");
      out.write("                        <li><a href=\"Download.jsp\" >DownLoad</a></li>\n");
      out.write("                        <li><a href=\"Profile.jsp\" >Profile view&edit</a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"Logout.jsp\" >Logout</a></li>\n");
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
