<%@include file="header.jsp" %>
<h2 style="color:purple;">${s_product}</h2>
<hr/>
 <form:form action="psave" method="post" modelAttribute="prod" enctype="multipart/form-data">
        
        
        <form:input type="file" path="multipart"/>
        <p class="hea">id</p><form:input path="id"  class="ab"/><br>
        <p class="hea">Name</p><form:input path="name"  class="ab"/><br>
        <p class="hea">Price</p><form:input path="price"  class="ab"/><br>
        <p class="hea">Description</p><form:input path="type"  class="ab"/><br>
        <form:button><p class="hea">Submit</p></form:button>
 </form:form>
<%@include file="footer.jsp" %>

