<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">

</head>
<body>

<form:form  action="viewprdt" commandName="product">


<table class="table table-striped table-hover">
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>


 
<tr>
  <th>Product Name</th>
   <th>Product Description</th>
   <th>Product Price</th>
</tr>
                
   <div class="row">
   <div class="item">
              <img src="resources/images/logo.png">
      </div>
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${product.getProduct_Id()}.jpg" />" >
                </div>
   
		</div>
					
					 <tr>
   
    <td>${product.product_Name}</td>
    <td>${product.product_Description}</td>
    <td>${product.product_Price}</td>
    
    
				
        <td align="center"> <a href="#"><span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</a></td>
        <td><a href="buynow" >BUY NOW</a></td>
        
     </tr>      
                  
                  

</div>
</div>
</div>
</table> 
                  
</form:form>
                


</body>

</html>