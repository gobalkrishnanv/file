<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${mes}

<form:form action="save" method="post" modelAttribute="u" enctype="multipart/form-data">
 <table>
  <tr>
   <td>
      ID:
   </td>
   <td>
      <form:input path="id" />
   </td>
  </tr>
  
  <tr>
   <td>
      Name:
   </td>
   <td>
      <form:input path="name" />
   </td>
  </tr>
  
  <tr>
   <td>
      Email:
   </td>
   <td>
      <form:input path="email" />
   </td>
  </tr>
  
  
  <tr>
   <td>
      password:
   </td>
   <td>
      <form:input path="password" />
   </td>
  </tr>
  
  <tr>
   <td>
      PhoneNumber:
   </td>
   <td>
      <form:input path="number" />
   </td>
  </tr>
  
  
  <tr>
   <td>
      Address
   </td>
   <td>
      <form:input path="address" value=""/>
   </td>
  </tr>
  
  
 
  
   <tr>
   
   <td>
      <form:button>save</form:button>
   </td>
  </tr>
 </table>

</form:form>

<table>
  <tr>
   <td>
      ID:
   </td>
   <td>
     ${u.id}
   </td>
  </tr>
  
  <tr>
   <td>
      Name:
   </td>
   <td>
   ${u.name} 
   </td>
  </tr>
  
  <tr>
   <td>
      Email:
   </td>
   <td>
      ${u.email}
   </td>
  </tr>
  
  
  <tr>
   <td>
      password:
   </td>
   <td>
      ${u.password}
   </td>
  </tr>
  
  <tr>
   <td>
      phonenumber:
   </td>
   <td>
      ${u.number}
   </td>
  </tr>
  <tr>
    <td>
Address
    </td>
    <td>
      ${u.address}
    </td>
   
  
  </tr>

 
 </table>
  

<table>
      
  
    <tr>
   <th>Id</th>
   <th>Name</th>
   <th>Email</th>
   <th>Password</th>
   <th>Type</th>
     </tr>
   <c:forEach var="p" items="${list}">
     <tr>
         <td>${p.id}</td>
         <td>${p.name}</td>
         <td>${p.email}</td>
         <td>${p.number}</td>
         <td>${p.address}</td>
         <td><a href="${p.empId}">Delete</a><a href="${p.empId}">Update</a> </td>
    </tr>    
  </c:forEach>
   
</table>
<img src="<c:url value="/resources/images/Arduino Uno.jpg"/>">
</body>
</html>