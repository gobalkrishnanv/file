<%@include file="header.jsp" %>

<table>

 <c:forEach var="p" items="${cl}">
  <tr>
   <td><h4 class="h4"> ${p.name}</h4></td>
   <td><img class="ima" src='<c:url value="/resources/images/${p.name}.jpg"/>' width="100" height="100"></td>
   <td><h4 class="h4">Quantity=${p.quantity}</h4></td>
   <td><h4>Price=${p.price}</h4></td>
    <td> <a href="<c:url value='/delete' />" class="upt"><h4 class="h4">Delete</h4></a></td>
    <td> <a href="<c:url value='/arduino' />" class="upt"><h4 class="h4">Update</h4></a></td>
    
  </tr>
 </c:forEach>
  <tr><td></td><td></td><td></td><td></td><td>Total Cash=${tcash}</td></tr>
</table>

<%@include file="footer.jsp" %>
