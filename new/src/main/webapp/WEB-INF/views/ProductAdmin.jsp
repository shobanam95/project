<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="resources/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="resources/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">

</head>
<style>
.carousel-inner > .item > img,  
  .carousel-inner > .item > a > img {  
      width: 100%;  
      margin: auto;  
      height: auto;
      height:100%;
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
input[type=text] {
height:40px;
    width: 130px;
    box-sizing: border-box;
      border-style: solid black groove;
    border: 2px solid #black;
    border-radius: 4px;
    font-size: 14px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px;
    background-repeat: no-repeat;
    padding: 8px 20px 12px 20px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:Hover {
    width: 20%;
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
      
      <a class="navbar-brand" >Ur Wardrobe</a>
    </div>

    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <li class="active"><a href="indexpage">Home</a></li>

        <li><a href="#">About Us</a></li>
       <li class="dropdown">
          <a href="Category" class="dropdown-toggle" data-toggle="dropdown">Category <b class="caret"></b></a>
          <ul class="dropdown-menu">
            <li><a href="category?cat=Women">Women's Collection</a></li>
            
            <li class="divider"></li>
            <li><a href="category?cat=Men">Men's Collection</a></li>
            <li class="divider"></li>
            <li><a href="category?cat=Kid">Kid's Collection</a></li>
          </ul>
        </li>
          </ul>
    

 

     
     <c:if test = "${sessionScope.name eq null}">
     
      <ul class="nav navbar-nav navbar-right">

        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user "></span> <b class="caret"></b></a>
          <ul class="dropdown-menu">
       
         
            <li><a href="loginup" >Login</a></li>
          
            <li class="divider"></li>
            <li><a href="signuo">Sign Up</a></li>
            
           
          </ul>
        </li>
      </ul>
       </c:if>
       <c:if  test = "${sessionScope.name ne null }">
       <h1>Welcome ,"${sessionScope.name }"</h1>
       <li><a href = "logout">Logout</a></li>
       </c:if>
    </div>
<div class="container">
<h1>Product Admin Function</h1>
<div align="center">
        <form:form  action="productdetails" method="post" commandName="funcprdt">   
  <a href="addprdt" class="btn btn-info" role="button">Add Product</a>
  <a href="editprdt" class="btn btn-info" role="button">Update Product</a>
  
   <a href="listprdt" class="btn btn-info" role="button"> Product List</a>
   </form:form>
</div>
</body>
</html>