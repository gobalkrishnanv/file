<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>">
<meta name="viewport" content="width=device-width, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">


<title>Arduino</title>
</head>
<body>

<div class="menubar">
<nav class="a"><b>Arduino</b></nav>
<div class="menu">
<a href="#" class="b"><img class="im" src="<c:url value='/resources/images/logo.jpg'/>" ></a>

<a href="home" class="home "><b>Home</b></a>-
<a href="<c:url value='/about' />" class="mi"><b>About</b></a>-
<div class="dropdown">
<div class="dropbtn">Product 
      <i class="fa fa-caret-down"></i>
    </div>
    <div class="dropdown-content">
      <a href="<c:url value='/arduino' />">Arduino</a>
      <a href="<c:url value='/shield' />">Shield</a>
    </div>

</div>



</div>


<nav class="form">
 <form:form class="form-style" action="login" method="post" modelAttribute="user">
 
 <form:input class="f1" path="name"  placeholder="username" />
 <form:input class="f1" path="password"  placeholder="password" />
 <form:button  class="fb">SignIn</form:button>
 <div class="tt"><a href="<c:url value='/reg' />">SignUp</a></div>
  <div class="tt"><a href="<c:url value='/logout' />">Logout</a></div>
 
 </form:form>

 </nav>
 


</div>

<div style="width:window.innerWidth;height:5vw;background-color:orange;"></div>
<div style="width:window.innerWidth;height:1vw;background-color:blue;"></div>
<div class="pd"></div>
