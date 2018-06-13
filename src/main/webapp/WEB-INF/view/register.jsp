<%@include file="header.jsp" %>

<h2 style="color:purple;">${reg}</h2>
<hr/>
 <form:form action="save" method="post" modelAttribute="user" enctype="multipart/form-data">
        
        
        <form:input type="file" path="multipart"/>
        <p class="hea">Name</p><form:input path="name"  class="ab"/><br>
        <p class="hea">Email</p><form:input path="email"  class="ab"/><br>
        <p class="hea">Password</p><form:input path="password"  class="ab"/><br>
        <p class="hea">Address</p><form:input path="address"  class="ab"/><br>
        <p class="hea">Phone Number</p><form:input path="number"  class="ab"/><br>
        
        <form:button><p class="hea">Register</p></form:button>
 </form:form>
 
 <%@include file="footer.jsp" %>
 