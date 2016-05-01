<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

    <title>2048</title>
    <link rel="stylesheet" type="text/css" href="/css/2048/2048.css" />

    <script type="text/javascript" src="/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="/js/2048/support2048.js"></script>
    <script type="text/javascript" src="/js/2048/showanimation2048.js"></script>
    <script type="text/javascript" src="/js/2048/main2048.js"></script>
    
</head>
<body>
    <header>
        <h1>2048</h1>
        <a href="javascript:newgame();" id="newgamebutton" class="gamebutton">新的游戏</a>
        <a class="gamebutton" href="/my2048/rank">排行榜</a>
        <a class="gamebutton" id="save" href="javascript:savegame();">保存并返回</a>
        <p>Modified by 王志远</p>
        <p>Learn from <a href="http://www.imooc.com/" target="_blank">慕课网</a></p>
        <p>score : <span id="score">${requestScope.my2048.score }</span></p>
        <p style="display:none" id="board">${requestScope.my2048.save }</p>
    </header>

    <div id="grid-container">
        <div class="grid-cell" id="grid-cell-0-0"></div>
        <div class="grid-cell" id="grid-cell-0-1"></div>
        <div class="grid-cell" id="grid-cell-0-2"></div>
        <div class="grid-cell" id="grid-cell-0-3"></div>

        <div class="grid-cell" id="grid-cell-1-0"></div>
        <div class="grid-cell" id="grid-cell-1-1"></div>
        <div class="grid-cell" id="grid-cell-1-2"></div>
        <div class="grid-cell" id="grid-cell-1-3"></div>

        <div class="grid-cell" id="grid-cell-2-0"></div>
        <div class="grid-cell" id="grid-cell-2-1"></div>
        <div class="grid-cell" id="grid-cell-2-2"></div>
        <div class="grid-cell" id="grid-cell-2-3"></div>

        <div class="grid-cell" id="grid-cell-3-0"></div>
        <div class="grid-cell" id="grid-cell-3-1"></div>
        <div class="grid-cell" id="grid-cell-3-2"></div>
        <div class="grid-cell" id="grid-cell-3-3"></div>
    </div>

</body>
</html>