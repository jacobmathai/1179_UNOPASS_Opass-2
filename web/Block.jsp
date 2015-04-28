<%-- 
    Document   : Block
    Created on : 4 Dec, 2014, 2:40:10 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;"%>
<%
            String st = request.getParameter("st");
            String un = request.getParameter("user");
            String sql = "";
            if (st.equals("1")) {
                sql = "update login set status=0 where username='" + un + "'";

            } else {
                sql = "update login set status=1 where username='" + un + "'";
            }
            new DBConnection().putData(sql);
            response.sendRedirect("AdminUserManagement.jsp");
%>