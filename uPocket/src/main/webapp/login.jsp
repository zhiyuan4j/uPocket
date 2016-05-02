<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>uPocket-login</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<link rel="stylesheet" href="./css/my.css">
	<link href="./css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<form action="./login.do" method="post">
			<div class="form-group" id="usernameGroup">
			<label for="InputUsername">Username</label>
				<input type="text" class="form-control" id="InputUsername" placeholder="用户名" name="username">
			</div>
			<div class="form-group" id="passwordGroup">
				<label for="InputPassword">Password</label>
				<input type="password" class="form-control" id="InputPassword" placeholder="密码" name="password">
			</div>
			
			<button type="submit" class="btn btn-default" id="loginBtn">登录</button>
			<a href="./register.jsp"><button type="button" class="btn btn-default pull-right">点此注册</button></a>
			<div style="color:red">${requestScope.result}</div>
		</form>
	</div>
	<script src="./js/jquery-1.12.3.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/login.js"></script>
</body>
</html>