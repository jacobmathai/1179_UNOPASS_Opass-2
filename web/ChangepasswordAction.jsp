<%-- 
    Document   : ChangepasswordAction
    Created on : 7 Dec, 2014, 1:40:10 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;"%>
<%
String s=session.getAttribute("uname").toString();
String p=session.getAttribute("pass").toString();
String cp=request.getParameter("pass");
String np=request.getParameter("npass");

if(p.equals(cp))
    {
    String sql="update login set password='"+np+"' where username='"+s+"' and password='"+p+"'";
            int i=new DBConnection().putData(sql);
            if(i>0)
                {
                session.removeAttribute("pass");
                session.setAttribute("pass", np);
                response.sendRedirect("ChangePassword.jsp?f=1");
                }
            else
                {
                  response.sendRedirect("ChangePassword.jsp?f=2");
                }
    }
else
    {
     response.sendRedirect("ChangePassword.jsp?f=3");
    }


%>
