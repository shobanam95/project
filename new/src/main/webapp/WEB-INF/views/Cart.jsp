<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form  action="addcart" method="post" commandName="cartitem" >
<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cart</h1>
                    <p>All the selected products in your shopping cart</p>
                </div>
            </div>
        </section>

        

                <table class="table table-hover">
                    <tr>
                        <th>Product</th>
                        <th>Product Price</th>
                        <th>Quantity</th>
                        <th>Product Description</th>
                    
                    </tr>
                    
                  <c:forEach var = "c" items="${cartitem}">
                  <tr>
                   <td>${c.getProduct_Name()}</td>
    			   <td>${c.getProduct_Description()}</td>
   				   <td>${c.getProduct_Price()}</td>
                  </tr>
                  </c:forEach>
                </table>

                <a href="<spring:url value="listprdt" />" class="btn btn-default">Continue Shopping</a>
            </div>
       
</div>
</form:form>

</body>
</html>