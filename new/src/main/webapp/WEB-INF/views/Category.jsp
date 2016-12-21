<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">

</head>

<body>

 <div class="item">
              <img src="resources/images/logo.png">
      </div>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All Products</h1>

            <p class="lead">Checkout all the awesome products available now!</p>
        </div>

        <table class="table table-striped table-hover">
 
 <tr>
  <th>Product Name</th>
   <th>Product Description</th>
   <th>Product Price</th>
</tr>

				<c:forEach var="cat" items="${prod}">
					
					 <tr>
   
    <td>${cat.getProduct_Name()}</td>
    <td>${cat.getProduct_Description()}</td>
    <td>${cat.getProduct_Price()}</td>
    <td><a href ="viproduct/${cat.getProduct_Id()}">view</a></td>
    
				</c:forEach>
</table>
</div>
</div>
</body>
</html>



