<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<!-- 弃用缓存 -->
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link href="/css/bootstrap.css" rel="stylesheet">
<title>2048排行榜</title>

</head>
<body>
	<table class="table table-striped">
		<thead>
			<tr>
				<th colspan="4" style="text-align: center">2048排行榜</th>
			</tr>
			<tr>
				<th>#</th>
				<th>昵称</th>
				<th>级别</th>
				<th>最高分</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ranks }" var="rank" varStatus="rowCount">
				<tr>
					<td>${rowCount.count }</td>
					<td>${rank.user.nickname }</td>
					<td>${rank.maxLevel }</td>
					<td>${rank.maxScore }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>