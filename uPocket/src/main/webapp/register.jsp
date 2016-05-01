<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>uPocket-register</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<link rel="stylesheet" href="./css/my.css">
	<link href="./css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<form action="/register.do" method="post">
			<div class="form-group" id="nicknameGroup">
				<label for="InputNickname" class="control-label">Nickname</label>
				<input type="text" class="form-control" id="InputNickname" placeholder="昵称" name="nickname">
			</div>
			<div class="form-group" id="usernameGroup">
				<label for="InputUsername" class="control-label">Username</label>
				<input type="text" class="form-control" id="InputUsername" placeholder="用户名" name="username">
			</div>
			<div class="form-group" id="passwordGroup">
				<label for="InputPassword" class="control-label">Password</label>
				<input type="password" class="form-control" id="InputPassword" placeholder="密码" name="password">
			</div>
			<div class="form-group" id="confirmPasswordGroup">
				<label for="InputPassword2" class="control-label">ConfirmPassword</label>
				<input type="password" class="form-control" id="InputPassword2" placeholder="确认密码">
			</div>
			
			<button type="submit" class="btn btn-default" id="registBtn" disabled>注册</button>
			<div id="result">${requestScope.result} </div>
			<div class="pull-right"><a href="/login.jsp">点此登录</a></div>
		</form>
	</div>
	<script src="./js/jquery-1.12.3.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/register.js"></script>
</body>
</html>