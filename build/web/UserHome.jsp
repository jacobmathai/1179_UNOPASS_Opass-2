<%-- 
    Document   : UserHome
    Created on : 11 Dec, 2014, 12:29:15 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>UNOPASS</title>
        <link rel="stylesheet" href="styles.css" type="text/css" />
        <script>
            function DisableBackButton()
{
history.forward();
}
        </script>
    </head>
    <body onload="DisableBackButton()">
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
                        <h2>Home</h2>
                        <p>

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

