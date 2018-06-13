<%@include file="header.jsp" %>

<table>
<tr>
  <td>
      <p class="hea">${mega.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${mega.name}.jpg"/>'></a>
      <p class="hea">${mega.price} Rs<p>
          <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${mega.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${mega.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
  </td>
     <td>
      <p class="hea">${usb.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${usb.name}.jpg"/>'></a>
      <p class="hea">${usb.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${usb.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${usb.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
   </td>
  
   
</tr>




<tr>
  <td>
      <p class="hea">${motor.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${motor.name}.jpg"/>'></a>
      <p class="hea">${motor.price} Rs<p>
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${motor.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${motor.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
  </td>
  
   <td>
      <p class="hea">${relay.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${relay.name}.jpg"/>'></a>
      <p class="hea">${relay.price} Rs<p>
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${relay.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${relay.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
   </td>
</tr>








</table>


<%@include file="footer.jsp" %>
