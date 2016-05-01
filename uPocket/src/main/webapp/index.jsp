<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>uPocket</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<link href="/css/bootstrap.css" rel="stylesheet">
	<link rel="stylesheet" href="/css/my.css">
</head>
<body>
	<div class="container index">
		<div id="main" style="color: #00c25f">
			<h1>并不知道主页要设计成什么样-_-|||</h1>
			<h5></h5>
			<br>
			<c:if test="${loginUser == null }">
			<h3>您还没<a href="/login.jsp">登录</a></h3>
			<br>
			<h3>还没有账号？<a href="/register.jsp">注册</a></h3>
			</c:if>
			<c:if test="${loginUser != null }">
			欢迎您：${loginUser.nickname }
			</c:if>
			
		</div>
		<%--
		<nav class="container navbar navbar-default navbar-inverse navbar-fixed-bottom text-center" style="height: 50px;">
			<div class="pull-left navbar-brand menuItem" style="border: 0"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uGames</a></div>
			<div class="pull-left navbar-brand menuItem"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uTools</a></div>
			<div class="pull-left navbar-brand menuItem"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uAbout</a></div>
		</nav>
		 --%>
		 <nav class="container navbar navbar-default navbar-inverse navbar-fixed-bottom text-center" style="height: 50px;">
			<div class="pull-left navbar-brand menuItem" style="border: 0"><a href="/my2048/index">my2048</a></div>
			<div class="pull-left navbar-brand menuItem"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uTools</a></div>
			<div class="pull-left navbar-brand menuItem"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uAbout</a></div>
		</nav>
	</div>
	<script src="/js/jquery-1.12.3.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/index.js"></script>
</body>
</html>