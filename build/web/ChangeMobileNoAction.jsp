<%-- 
    Document   : changeMobileNoAction
    Created on : 6 Dec, 2014, 11:14:11 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;"%>
<%
 String pass1=session.getAttribute("pass").toString();
 String uname=session.getAttribute("uname").toString();
String pass=request.getParameter("pass1");
String nmob=request.getParameter("nmob");
if(pass1.equals(pass))
    {
    String sql="update register set mobile='"+nmob+"' where username='"+uname+"' and password='"+pass+"'";
    int i=new DBConnection().putData(sql);
    if(i>0)
        {
        response.sendRedirect("ChangeMobileNo.jsp?f=1");
        }
    else
        {
          response.sendRedirect("ChangeMobileNo.jsp?f=2");
        }
       }
    else
    {
     response.sendRedirect("ChangeMobileNo.jsp?f=3");
    }
    

%>