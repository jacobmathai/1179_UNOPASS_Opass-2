<%-- 
    Document   : Profile
    Created on : 9 Dec, 2014, 3:20:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;
import java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>UNOPASS</title>
        <link rel="stylesheet" href="styles.css" type="text/css" />
    </head>
    <body>
        <div id="wrap">

            <div id="header">
                <div id="innerheader">
                    <div id="title">
                        <h1>UNOPASS</h1>
                        <h2></h2>
                    </div>
                </div>
            </div>

            <div id="content">
                <div id="page">
                    <div class="innerpage">

                        <h2>Profile</h2>
                        <p>
                            <form action="ProfileAction.jsp" method="post">
                                <table>
                                    <%! ResultSet rs;%>
                                    <%
                                                try {
                                                    String s = session.getAttribute("uname").toString();
                                                    String sql = "select * from register where username='" + s + "'";
                                                    rs = new DBConnection().getData(sql);
                                                    if (rs.next()) {

                                    %>
                                    <tr>
                                        <td>
                                            <h3> Personal Details</h3>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>First Name:</td>
                                        <td><input type="text" name="fname" id="txtfirstname" value="<%= rs.getString("fname")%>"/></td></tr><tr> <td>LastName</td><td><input type="text" name="LastName" id="LastName" value="<%= rs.getString("lname")%>"/></td>

                                    </tr>
                                    <tr>
                                        <  <td>Gender:</td>
                                        <td colspan="2">
                                            <input type="radio" name="sex" id="sex" value="male" <% if (rs.getString("gender").equals("male")) {%> checked="true" <% }%>/> Male
                                            <input type="radio" name="sex" id="sex" value="female" <% if (rs.getString("gender").equals("female")) {%> checked="true" <% }%>/> Female
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Date of Birth: </td>
                                        <td>
                                            <input type="Text" name="dob" id="dob" value="<%= rs.getString("dob")%>"/>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>Phone:</td>
                                        <td><input type="text" name="txtphone" id="txtphone" value="<%= rs.getString("phone")%>"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Alternate Mobile No:</td>
                                        <td><input type="text" name="txtmobile" id="txtmobile" value="<%= rs.getString("altmob")%>"/>
                                        </td>                  </tr>

                                    <tr>
                                        <td>EMail:</td>
                                        <td><input type="text" name="txtemail" id="txtemail" value="<%= rs.getString("email")%>"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h3>
                                                Address
                                            </h3>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Street name:</td>
                                        <td><input type="text" name="txtstreetname" id="txtstreetname" value="<%= rs.getString("streetname")%>"/>
                                        </td>

                                    </tr>
                                    <tr>
                                        <td>City:</td>
                                        <td><input type="text" name="txtcity" id="txtcity" value="<%= rs.getString("city")%>"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>ZIP:</td>
                                        <td><input type="text" name="txtzip" id="txtzip" value="<%= rs.getString("zip")%>"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>State:</td>
                                        <td><input type="text" name="txtstate" id="txtstate" value="<%= rs.getString("state")%>"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Country:</td>
                                        <td ><input type="text" name="txtcountry" id="txtcountry" value="<%= rs.getString("country")%>"/>
                                        </td>
                                    </tr>

                                    <%
                                                    }
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                    %>


                                    <tr>
                                        <td>&nbsp;&nbsp;&nbsp;</td>
                                        <td> <input type="submit" value="Update" style="font: bolder;background: red"></input><input type="reset" value="Reset" style="font: bolder;background: red"></input></td>
                                    </tr>
                                </table>

                            </form>
                        </p>

                        <p></p>
                        <ul>
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                        </ul>

                        <h3></h3>
                        <p></p>
                        <h3></h3>
                        <p><a href=""></a> </p>
                        <h3></h3>


                        <p></p>
                    </div>
                </div>
                <div id="sidebar">
                    <ul>
                        <li><a href="UserHome.jsp" class="selected">Home</a></li>
                        <li><a href="ChangePassword.jsp">Change Password</a></li>
                        <li><a href="ChangeMobileNo.jsp" >changeMobile No</a></li>
                        <li><a href="Download.jsp" >DownLoad</a></li>
                        <li><a href="Profile.jsp" >Profile view&edit</a></li>

                        <li><a href="Logout.jsp" >Logout</a></li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>

            <div id="footer">

            </div>
        </div>

    </body>
</html>


