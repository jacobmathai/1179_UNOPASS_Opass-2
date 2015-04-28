<%-- 
    Document   : Logout
   Created on : 8 Dec, 2014, 4:02:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
session.removeAttribute("uname");
session.removeAttribute("pass");
response.sendRedirect("index.jsp");
%>
