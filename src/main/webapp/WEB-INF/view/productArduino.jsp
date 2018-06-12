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
      <p class="hea">${micro.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${micro.name}.jpg"/>'></a>
      <p class="hea">${micro.price} Rs<p>
      
      
   <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${micro.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${micro.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
  </td>
</tr>


<tr>
  <td>
      <p class="hea">${genuino.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${genuino.name}.jpg"/>'></a>
      <p class="hea">${genuino.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${genuino.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${genuino.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
  </td>
  
   <td>
      <p class="hea">${leonardo.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${leonardo.name}.jpg"/>'></a>
      <p class="hea">${leonardo.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${leonardo.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${leonardo.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
  </td>
</tr>



<tr>
  <td>
      <p class="hea">${ethernet.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${ethernet.name}.jpg"/>'></a>
      <p class="hea">${ethernet.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${ethernet.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${ethernet.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
      
  </td>
  
   <td>
      <p class="hea">${lilypad.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${lilypad.name}.jpg"/>'></a>
      <p class="hea">${lilypad.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${lilypad.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${lilypad.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
   </td>
</tr>



<tr>
  <td>
      <p class="hea">${uno.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${uno.name}.jpg"/>'></a>
      <p class="hea">${uno.price} Rs<p>
      
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${uno.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${uno.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
  </td>
  
   <td>
      <p class="hea">${nano.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${nano.name}.jpg"/>'></a>
      <p class="hea">${nano.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${nano.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${nano.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
   </td>
</tr>


<tr>
  <td>
      <p class="hea">${esplora.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${esplora.name}.png"/>'></a>
      <p class="hea">${esplora.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${esplora.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${esplora.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
      
  </td>
  
   <td>
      <p class="hea">${mo.name}</p>
      <a href="#"> <img class="ima" src='<c:url value="/resources/images/${mo.name}.jpg"/>'></a>
      <p class="hea">${mo.price} Rs<p>
      
       <form:form action="cart" method="post" modelAttribute="ct">
        
        <p class="hea">Name</p><form:input path="name" value="${mo.name}" class="ab"/><br>
        <p class="hea">Quantity</p><form:input path="quantity" value="1" class="ab"/><br>
        <p class="hea">Price</p><form:input path="price" value="${mo.price}" class="ab"/><br>
        
        <form:button><p class="hea">Cart</p></form:button>
      </form:form>
      
   </td>
</tr>




</table>


<%@include file="footer.jsp" %>
