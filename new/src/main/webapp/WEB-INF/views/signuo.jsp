<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Registration</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">
</head>
<style>
@import url(http://fonts.googleapis.com/css?family=Open+Sans:400,700);
body {background: #456;font-family: 'Open Sans', sans-serif;}
.login { width: 400px;margin: 16px auto;font-size: 16px;}
/* Reset top and bottom margins from certain elements */
.login-header,.login p { margin-top: 0;margin-bottom: 0;}
/* The triangle form is achieved by a CSS hack */
.login-triangle {width: 0;margin-right: auto;margin-left: auto;border: 12px solid transparent;border-bottom-color: #28d;}
.login-header {background: #28d;padding: 20px;font-size: 1.4em;font-weight: normal;text-align: center;text-transform: uppercase;color: #fff;}
.login-container {background: #ebebeb;padding: 12px;}
/* Every row inside .login-container is defined with p tags */
.login td {padding: 12px;}
.login input {box-sizing: border-box;display: block;width: 100%;border-width: 1px;border-style: solid;padding: 16px;outline: 0;font-family: inherit;font-size: 0.95em;}
.login input[type="email"],.login input[type="password"] {background: #fff;border-color: #bbb;color: #555;}
/* Text fields' focus effect */
.login input[type="email"]:focus, .login input[type="password"]:focus {  border-color: #888;}
.login input[type="submit"] {background: #28d;border-color: transparent;color: #fff;cursor: pointer;}
.login input[type="submit"]:hover {background: #17c;}
/* Buttons' focus effect */
.login input[type="submit"]:focus {border-color: #05a;}
@media all and (max-width:450px){
.login {width: 95%;}
}    
.navbar-right{
background-color: activeborder;
}
.navbar-collapse{
border-color: blue;
}
.caret-up {
    width: 20; 
    height: 0; 
    border-left: 4px solid rgba(0, 0, 0, 0);
    border-right: 4px solid rgba(0, 0, 0, 0);
    border-bottom: 4px solid;
    color:blue;
    display: inline-block;
    margin-left: 20px;
    vertical-align: middle;
    }
      h2{
font-family: Arial, Helvetica, sans-serif;
font-style: normal;
 font-size: 20px;
  font-style: oblique;
 text-align: right;
}



h2{
font-family: Arial, Helvetica, sans-serif;
font-style: normal;
 font-size: 20px;
  font-style: oblique;
 text-align: right;
}
#bar {
text-shadow: 2px 2px #black;
  text-align:right;
}
}
</style>
<script type="text/javascript">
$(function(){
    $(".dropdown").hover(            
            function() {
                $('.dropdown-menu', this).stop( true, true ).fadeIn("fast");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
            },
            function() {
                $('.dropdown-menu', this).stop( true, true ).fadeOut("fast");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
            });
    });
    
    
function checkPass()  {
var password = document.getElementById("password")
, confirm_password = document.getElementById("confirm_password");

function validatePassword(){
if(password.value != confirm_password.value) {
  confirm_password.setCustomValidity("Passwords Don't Match");
} else {
  confirm_password.setCustomValidity('');
}
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;
} 
    

   </script>



<body>

    <div align="center">
          <div class="container">
	<div class="row">
		<div class="login">
  <div class="login-triangle"></div>
  
  <h2 class="login-header">Sign Up</h2>

  <div class="login-container">
    
        <form:form  action="signuo"  method="post" commandName="loginsign" >
        
                             <table>
                          <tr>
                          <div>
                                 <td><form:label path="username">UserName</form:label></td>
                    <td><form:input path="username" name="username"  required ="true"></form:input></td>
                </tr>
                               <tr>
               <td><form:label path="password">Password:</form:label></td>
                <td><form:input type="password" name="password" path="password" id="password" required="true"></form:input></td>
                               </tr>  
                <tr>
                <td><form:label path = "confirm_password">Confirm Password:</form:label></td>
                  <td><form:input type="password" name = "confirm_password" path="confirm_password" id="confirm_password" onkeyup="checkPass()" required="true"></form:input></td>                              
                </tr>
                 <tr>            
                <td><form:label path="email">Email:</form:label></td>
                <td><form:input type="email" name = "email" id="email" path="email" required ="true" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"></form:input></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
      </form:form>
    </div>
</body>
</html>
</body>
</html>