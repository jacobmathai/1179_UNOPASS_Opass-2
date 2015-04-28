<%-- 
    Document   : Register.jsp
    Created on : 10 Dec, 2014, 3:24:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>UNOPASS</title>
        <link rel="stylesheet" href="styles.css" type="text/css" />
        
         <link rel="stylesheet" href="css/validationEngine.jquery.css" type="text/css"/>
	
        
        <script src="js/jquery-1.7.2.min.js" type="text/javascript">
	</script>
        
        <script src="js/jquery.validationEngine-en.js" type="text/javascript" charset="utf-8">
	</script>
        
        <script src="js/jquery.validationEngine.js" type="text/javascript" charset="utf-8">
	</script>
         <script>
             
		jQuery(document).ready(function(){
			// binds form submission and fields to the validation engine
			jQuery("#formID").validationEngine();
		});
         </script>
        
        
        
        <%--
        <script>
            
            
            function valid()
            {
                if(document.getElementById("username").value=="")
                {
                    alert("enter the username");
                    document.getElementById("username").focus();
                    return false;

                }
                if(document.getElementById("pswd").value=="")
                {
                    alert("enter the password");
                    document.getElementById("pswd").focus();
                    return false;

                }
                if(document.getElementById("cnpass").value=="")
                {
                    alert("enter the confirm password");
                    document.getElementById("cnpass").focus();
                    return false;

                }
                if(document.getElementById("fname").value=="")
                {
                    alert("enter the firstname");
                    document.getElementById("fname").focus();
                    return false;

                }
                if(document.getElementById("lname").value=="")
                {
                    alert("enter the lastname");
                    document.getElementById("lname").focus();
                    return false;

                }
                if(document.getElementById("dob").value=="")
                {
                    alert("enter the Date of birth");
                    document.getElementById("dob").focus();
                    return false;

                }
                if(document.getElementById("txtphone").value=="")
                {
                    alert("enter the phone no");
                    document.getElementById("txtphone").focus();
                    return false;

                }
                if(document.getElementById("txtmobile").value=="")
                {
                    alert("enter the mob no");
                    document.getElementById("txtemobile").focus();
                    return false;

                }
                if(document.getElementById("mob").value=="")
                {
                    alert("enter the email-id");
                    document.getElementById("mob").focus();
                    return false;

                }
                if(document.getElementById("txtemail").value=="")
                {
                    alert("enter the email-id");
                    document.getElementById("txtemal").focus();
                    return false;

                }
                if(document.getElementById("txtstreet").value=="")
                {
                    alert("enter the street");
                    document.getElementById("txtstreet").focus();
                    return false;

                }
                if(document.getElementById("txtcity").value=="")
                {
                    alert("enter the city");
                    document.getElementById("txtcity").focus();
                    return false;

                }
                if(document.getElementById("txtzip ").value=="")
                {
                    alert("enter the zip");
                    document.getElementById("txtzip").focus();
                    return false;

                }
                if(document.getElementById("txtstate").value=="")
                {
                    alert("enter the state");
                    document.getElementById("txtstate").focus();
                    return false;

                }
                if(document.getElementById("txtcountry").value=="")
                {
                    alert("enter the Country");
                    document.getElementById("txtcountry").focus();
                    return false;

                }
                if(document.getElementById("sec_qn").value=="q0")
                {
                    alert("Choose any Question");
                    document.getElementById("sec_qn").focus();
                    return false;

                }
                if(document.getElementById("sec").value=="")
                {
                    alert("Choose any Question");
                    document.getElementById("sec").focus();
                    return false;

                }
                if(document.getElementById("pswd").value==document.getElementById("cnpass").value)
                {
                    alert("password missmatch");
                    document.getElementById("cnpass").focus();
                    return false;
                }
            }
            function usercheck(a)
            {
              


                var xmlhttp;
                if (window.XMLHttpRequest)
                {// code for IE7+, Firefox, Chrome, Opera, Safari
      
  
                    xmlhttp=new XMLHttpRequest();
                }
                else
                {// code for IE6, IE5
   
  
                    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttp.onreadystatechange=function()
                {
                    if (xmlhttp.readyState==4 && xmlhttp.status==200)
                    {
                        document.getElementById("nam").innerHTML=xmlhttp.responseText;
                    }
                }
                xmlhttp.open("GET","Usercheck.jsp?uname="+a,true);
                xmlhttp.send();

            }
        </script> --%>
        
        
    </head>
    <body>
        <div id="wrap">

            <div id="header">
                <div id="innerheader">
                    <div id="title">
                        <h1>UNOPASS</h1>
                        <h2>Make secure
                        </h2>
                    </div>
                </div>
            </div>

            <div id="content">
                <div id="page">
                    <div class="innerpage">

                        <h2>Register Now</h2>
                        <p>
                            <form action="RegisterAction.jsp" method="post" id="formID" class="formular">
                                <table>
                                    <tr>
                                        <td>
                                            <h3> Login Details</h3>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Username:
                                        </td>
                                        <td>
                                            
                                            <input class="validate[required] text-input" type="text" id="username" name="username"></input>
                                       
                                        </td>
                                        <td>
                                            <div id="nam" style="color: red"></div>
                                        </td>

                                    </tr>
                                    <tr>
                                        <td>
                                            Mobile No:
                                            
                                        </td>
                                        <td>
                                            
                                            <input maxlength="10" class="validate[required],custom[integer] text-input" type="text" id="mob" name="mob" value=""></input>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Password:
                                        </td>
                                        <td>
                                            <input class="validate[required] text-input,custom[onlyLetterNumber]" type="password" id="pswd" name="pswd" value=""></input>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Confirm Password:
                                        </td>
                                        <td>
                                            <input class="validate[required,equals[pswd]] text-input custom[onlyLetterNumber]" type="password" id="cnpass" name="cnpass"></input>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h3> Personal Details</h3>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>First Name:</td>

                                        <td><input  class="validate[required,custom[onlyLetterSp]] text-input" type="text" name="fname" id="fname"/></td></tr>
                                    <tr> 
                                        <td>Last Name</td>
                                        <td><input class="validate[required,custom[onlyLetterSp]] text-input" type="text" name="lname" id="lname"/></td>

                                    </tr>
                                    <tr>
                                        <td>Gender:</td>
                                        <td colspan="2">
                                            <input class="validate[required] radio" type="radio" name="sex" id="sex" value="male" checked="true"/> Male
                                            <input class="validate[required] radio" type="radio" name="sex" id="sex" value="female"/> Female
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Date of Birth: </td>
                                        <td>
                                            <input class="validate[required,custom[date]] text-input" type="Text" name="dob" id="dob"/>
                                        </td>
                                    </tr>

                                    
                                    <tr>
                                        <td>Alternate Mobile No:</td>
                                        <td><input maxlength="10" class="validate[required,custom[onlyLetterNumber] text-input" type="text" name="txtmobile" id="txtmobile"/>
                                        </td>                  </tr>

                                    <tr>
                                        <td>EMail:</td>
                                        <td><input class="validate[required,custom[email]]" type="text" name="txtemail" id="txtemail"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h3>
                                                Address
                                            </h3>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Street name:</td>
                                        <td><input  class="validate[required] text-input" type="text" name="txtstreet" id="txtstreet"/>
                                        </td>

                                    </tr>
                                    <tr>
                                        <td>City:</td>
                                        <td><input  class="validate[required] text-input" type="text" name="txtcity" id="txtcity"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>ZIP:</td>
                                        <td><input class="validate[required] text-input" type="text" name="txtzip" id="txtzip"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>State:</td>
                                        <td><input class="validate[required] text-input" type="text" name="txtstate" id="txtstate"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Country:</td>
                                        <td ><input class="validate[required] text-input" type="text" name="txtcountry" id="txtcountry"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h3>
                                                Security Details
                                            </h3>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Security Question</td>
                                        <td>
                                            <select name="sec_qn" id="sec_qn" class="validate[required]">
                                                <option value="">n--Choose your question-- </option>
                                                <option value="q1">What was your dream job as a child?</option>
                                                <option value="q2">What was your childhood nickname?</option>
                                                <option value="q3">What is the name of your childhood friend?</option>
                                                <option value="q4">What is your oldest sibling’s birthday year?</option>
                                                <option value="q5">What is the name of your first child?</option>
                                                <option value="q6">What school did you attend for sixth grade?</option>
                                                <option value="q7">What is your oldest cousin's first name?</option>
                                                <option value="q8">In what city or town was your first job?</option>
                                                <option value="q9">Who is your first class teacher?</option>
                                                <option value="q10">Name of a college you first applied?</option>
                                            </select>
                                        </td>
                                        <tr>
                                            <td>
                                                Your Answer:
                                            </td>
                                            <td>
                                                <input class="validate[required] text-input" type="text" id="sec" name="sec">

                                                </input>
                                            </td>

                                        </tr>

                                    </tr>

                                    <tr>
                                        <td>&nbsp;&nbsp;&nbsp;</td>
                                        <td> <input type="submit" value="Register" style="font: bolder;background: red" onclick="return valid()"></input><input type="reset" value="Reset" style="font: bolder;background: red"></input></td>
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


                    </ul>
                </div>
                <div class="clear"></div>
            </div>

            <div id="footer">

            </div>
        </div>

    </body>
</html>

