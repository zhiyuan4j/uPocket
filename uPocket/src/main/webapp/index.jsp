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
	<link href="./css/bootstrap.css" rel="stylesheet">
	<link rel="stylesheet" href="./css/my.css">
</head>
<body>
	<div class="container index">
		<div id="main" style="color: #f2f2f2">
			<h2>主页先将就下吧，不知道怎么设计，愁0.o</h2>
			<h5></h5>
			<h4>这个订阅号还没有微信登录的权限，只能让你们手动登录注册了=.=。帐号密码没必要搞太复杂，反正我这个公众号不涉及你的任何隐私。</h4>
			<h4>目前只弄好了2048，试一试我这版的吧*.*</h4>
			<br>
			<c:if test="${loginUser == null }">
			<h3><strong>您还没<a href="./login.jsp">登录</a></strong></h3>
			<br>
			<h3><strong>还没有账号？<a href="./register.jsp">注册</a></strong></h3>
			</c:if>
			<c:if test="${loginUser != null }">
			<h2>欢迎您：${loginUser.nickname }</h2>
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
			<div class="pull-left navbar-brand menuItem" style="border: 0"><a href="./my2048/index">my2048</a></div>
			<div class="pull-left navbar-brand menuItem"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uTools</a></div>
			<div class="pull-left navbar-brand menuItem"><a><span class="glyphicon glyphicon-triangle-top icon"></span>uAbout</a></div>
		</nav>
	</div>
	<script src="./js/jquery-1.12.3.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/index.js"></script>
</body>
</html>