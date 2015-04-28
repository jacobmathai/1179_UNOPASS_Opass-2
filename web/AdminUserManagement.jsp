<%-- 
    Document   : UserManagement
    Created on : 4 Dec, 2014, 1:34:10 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;import java.sql.ResultSet;"%>
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
                        <h2> User Management</h2>

                        <form action="" method="post">

                            <table>
                                <tr>
                                    <th>
                                        UserName
                                    </th>
                                    <th>
                                        email
                                    </th>
                                  
                                    <th>
                                        Street
                                    </th>
                                    <th>
                                        city
                                    </th>
                                    <th>
                                        state
                                    </th>
                                    <th>
                                        country
                                    </th>
                                    <th>
                                        block/unblock
                                    </th>
                                    <th>
                                        delete
                                    </th>
                                </tr>
                                <tr>
                                <%! String ar[] = new  String[9];int i;%>
                                 <%
                                 try
                                         {

                                             String sql  = "select * from register join login on register.username=login.username";
                                    ResultSet rs = new DBConnection().getData(sql);
                                    while(rs.next())
                                        {
                                        ar[0]=rs.getString("username");
                                        ar[1]=rs.getString("email");
                                        ar[2]=rs.getString("altmob");
                                        ar[3]=rs.getString("dob");
                                        ar[4]=rs.getString("streetname");
                                         ar[5]=rs.getString("city");
                                        ar[6]=rs.getString("state");
                                        ar[7]=rs.getString("country");
                                        i=rs.getInt("status");
                                       

                                %>
                                <td>
                                    <%= ar[0]%>
                                </td>
                                <td>
                                    <%= ar[1] %>
                                </td>
                                 
                                 <td>
                                    <%=ar[4]%>
                                </td>
                                 <td>
                                    <%=ar[5]%>
                                </td>
                                 <td>
                                    <%=ar[6]%>
                                </td>
                                 <td>
                                    <%=ar[7]%>
                                </td>
                                <td>
                                    <%
                                    if(i==1)
                                        {
                                    %>
                                    <a href="Block.jsp?st=1&user=<%= ar[0]%>" style="color: red">Block</a>
                                    <%
                                    }
                                        else
                                            {
                                            %>
                                  <a href="Block.jsp?st=0&user=<%= ar[0]%>" style="color: green">Unblock</a>
                                          <%  }
                                    %>
                                </td>
                                <td>
                                     <a href="Delete.jsp?user=<%= ar[0]%>" style="color: purple">Delete</a>
                                </td>
                            </tr>
                                <%
                                   }
                                    }
                                    catch(Exception e)
                                            {
                                        e.printStackTrace();
                                        }
                                %>

                            </table>
                        </form>


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
                         <li><a href="AdminHome.jsp" >AdminHome</a></li>
                       <li><a href="AdminUserManagement.jsp" class="selected">User Management</a></li>
           
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

