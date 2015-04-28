<%-- 
    Document   : PasswordcheckMobile
    Created on : 8 Dec, 2014, 2:24:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.ResultSet,com.mtech.db.DBConnection,com.mtech.db.AeSimpleSHA1;"%>
<%
String lp=request.getParameter("ltp");
String uname=request.getParameter("un");
 String s= new AeSimpleSHA1().SHA1(lp);

String sql="select * from login where username='"+uname+"' and password='"+s+"'";
ResultSet rs=new DBConnection().getData(sql);
if(rs.next())
    {
    out.print("valid ");
    }
else
    {
    out.print("invalid password or username");
    }
%>
