<%-- 
    Document   : delete
    Created on : 7 Dec, 2014, 2:30:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;"%>
<%
String un=request.getParameter("user");
String sql="delete from login where username='"+un+"'";
String sql1="delete from register where username='"+un+"'";
new DBConnection().putData(sql);
new DBConnection().putData(sql1);
response.sendRedirect("AdminUserManagement.jsp");
%>