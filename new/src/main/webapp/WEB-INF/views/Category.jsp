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
 <table align="centre" border="1">
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
    <td><a href ="view?cat="${prod }">view</a></td>
    
				</c:forEach>
</table>
</body>
</html>



