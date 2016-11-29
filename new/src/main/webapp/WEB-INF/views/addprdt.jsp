<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">
</head>
<style>
.navbar-right{
background-color:yellow;
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
                $(this).toggleClssass('open');
                $('b', this).toggleClass("caret caret-up");                
            });
    });
    
</script>

<body>
<div class="item">
              <img src="resources/images/logo.png">
      </div>
 <nav class="navbar navbar-default" role="navigation">
  
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Ur Wardrobe</a>
    </div>

    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <li class="active"><a href="indexpage">Home</a></li>
       <li><a href="ProductAdmin">Admin</a></li>
      
          </ul>
     
     
      <ul class="nav navbar-nav navbar-right">

        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle ="dropdown">Admin Logged <b class="caret"></b></a>
       
           
            
          </ul>
      
    </div>
    
    <div class="container">
 <div align="center">
 
        <form:form  action="addprdts" method="post" commandName="prdt1ad" style=" border-top-width: 100px; height: 1000px; width: 800px; padding-top: 100px; padding-bottom: 100px; left: 100px; top: 100px;">   
         <table>
         
       <tr>
           <td><form:label path="product_Name">Product Name:</form:label></td>
           <td><form:input path="product_Name" /></td>
       </tr>
       <tr>
           <td><form:label path="product_Description">Product Description:</form:label></td>
           <td><form:input path="product_Description"/></td>
       </tr>
       <tr>
           <td><form:label path="product_Price">Product Price:</form:label></td>
           <td><form:input path="product_Price"/></td>
       </tr>
       <tr>
       <td><label>Category</label></td>
       <td><select name = "Category">
           
           <option value = "Women">Women</option>
               <option value = "Men">Men</option>
                   <option value = "Kids">Kids</option>
           </select>
     
       </tr>
                 <tr>
         <td colspan="2"> <a href="addprdt"><input type="submit" value="add"/></a></td>
        </tr>
 
        </table> 
  </form:form>


</div>

  </div>
  </nav>
  

</body>
</html>
