<%-- 
    Document   : Usercheck
    Created on : 10 Dec, 2014, 09:24:08 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.ResultSet,com.mtech.db.DBConnection;"%>
<%
String s=request.getParameter("uname");
String sql="select * from login where username='"+s+"'";
ResultSet rs=new DBConnection().getData(sql);
if(rs.next()){
    out.print("user exists");
    }

%>