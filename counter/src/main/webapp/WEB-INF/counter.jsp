<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="d-flex justify-content-center">
<h3 class="m-5">You have visited http://your server <c:out value="${count}"/> times.</h3>
<h3><a href="http://localhost:8080//your_server"> Try another visit!</a></h3>
</div>

</body></html>

