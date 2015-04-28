<%-- 
    Document   : index
   Created on : 8 Dec, 2014, 2:24:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>UNOPASS</title>
        <link rel="stylesheet" href="styles.css" type="text/css" />u
      <link rel="stylesheet" href="css/validationEngine.jquery.css" type="text/css"/>
	
        
        <script src="js/jquery-1.7.2.min.js" type="text/javascript">
	</script>
        
        <script src="js/jquery.validationEngine-en.js" type="text/javascript" charset="utf-8">
	</script>
        
        <script src="js/jquery.validationEngine.js" type="text/javascript" charset="utf-8">
	</script>
        
        
        <script>
            
            //function to check hello field in the form
            
            
		jQuery(document).ready(function(){
			// binds form submission and fields to the validation engine
			jQuery("#formID").validationEngine();
		});
                    </script>
    
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
                        <h2>Login</h2>
                        <p>
                            <form action="indexAction.jsp" method="post" id="formID" class="formular">
                                <table>
                                    <tr>
                                        <td>
                                            UserName:
                                        </td>
                                        <td>
                                            <input type="text" id="uname" name="uname" class="validate[required] text-input"></input>
                                        </td>
                                    </tr>
                                        <tr>
                                        <td>
                                            Password:
                                        </td>
                                        <td>
                                            <input type="password" id="Mob" name="pass" class="validate[required] text-input"></input>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>&nbsp;&nbsp;&nbsp;</td>
                                        <td> <input type="submit" value="Login" style="background: red;font-weight:bolder" onclick="return validate()"></input><input type="reset" value="Reset" style="background: red;font-weight: bolder"></input></td>
                                    </tr>
                                    <tr>
                                        <td style="color: red">
                                            <%
                                            String st=request.getParameter("f");
                                            if(st!=null)
                                                {
                                                if(st.equals("1"))

                                                    {
                                                    out.print("Your account has been blocked..");
                                                }
                                            if(st.equals("2"))
                                                    {
                                                out.print("Entered wrong username or password");
                                                }
                                            }

%>
                                        </td>
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
                        <li><a href="Register.jsp" class="selected">Register Now</a></li>

                    </ul>
                </div>
                <div class="clear"></div>
            </div>

            <div id="footer">

            </div>
        </div>

    </body>
</html>
