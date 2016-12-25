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
<style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>
<body>


              <img src="resources/images/logo.png">
     

        <table id="customers">
 
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



