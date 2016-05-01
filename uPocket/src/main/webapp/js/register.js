//昵称输入框失焦时判断昵称是否已经存在
$("#InputNickname").blur(function() {
	var value = $("#InputNickname").val().trim();
	if (value == "") {
		$("#nicknameGroup label").text("Nickname----昵称不能为空");
		$("#nicknameGroup").prop("class", "form-group has-error");
	} else {
		$.ajax({
			url : "/checkNickname.do",
			type : "GET",
			dataType : "text",
			cache: false,
			data : {
				nickname : value,
				time : new Date().getTime()
			},
			success : function(data) {
				if ("success" == data) {
					$("#nicknameGroup label").text("Nickname----OK");
					$("#nicknameGroup").prop("class", "form-group has-success");
				}
				if ("failure" == data) {
					$("#nicknameGroup label").text("Nickname----昵称已被注册");
					$("#nicknameGroup").prop("class", "form-group has-error");
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("XHR status="+XMLHttpRequest.status+";readyState="+XMLHttpRequest.readyState +";textStatus="+textStatus);
			},
			complete: function() {
//				alert("请求完成");
			}
		});
	}
	disableBtn();
});

// 监听用户名输入框是否有空格
$("#InputUsername").bind("input propertychange", function() {
	if ($("#InputUsername").val().indexOf(" ")>=0) {
		$("#usernameGroup").prop("class", "form-group has-error");
		$("#usernameGroup label").text("Username----用户名不能还有空格");
	}
	disableBtn();
});

// 监听用户名输入框失焦后的重名判断
$("#InputUsername").blur(function() {
	if($("#InputUsername").val() != "") {
		$.ajax({
			url : "/checkUsername.do",
			type : "get",
			dataType : "text",
			data : {
				username : $("#InputUsername").val(),
				time : new Date().getTime()
			},
			success : function(data) {
				if ("success" == data) {
					$("#usernameGroup label").text("Username----OK");
					$("#usernameGroup").prop("class", "form-group has-success");
				}
				if ("failure" == data) {
					$("#usernameGroup label").text("username----用户名已被注册");
					$("#usernameGroup").prop("class", "form-group has-error");
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("XHR status="+XMLHttpRequest.status+";readyState="+XMLHttpRequest.readyState +"textStatus="+textStatus);
			},
			complete: function() {
//				alert("请求完成");
			}
		});
	} else {
		$("#usernameGroup").prop("class", "form-group has-error");
		$("#usernameGroup label").text("Username----用户名不能为空");
	}
	disableBtn();
});

// 监听密码输入框是否有空格
$("#InputPassword").bind("input propertychange", function() {
	$("#confirmPasswordGroup label").text("confirmPassword");
	$("#confirmPasswordGroup").prop("class", "form-group");
	if ($("#InputPassword").val().indexOf(" ")>=0) {
		$("#passwordGroup").prop("class", "form-group has-error");
		$("#passwordGroup label").text("Password----用户名不能还有空格");
	}
	disableBtn();
});

// 监听密码输入框失焦事件
$("#InputPassword").blur(function() {
	if($("#InputPassword").val()!="") {
		$("#passwordGroup label").text("Password----OK");
		$("#passwordGroup").prop("class", "form-group has-success");
	} else {
		$("#passwordGroup label").text("Password----密码不能为空");
		$("#passwordGroup").prop("class", "form-group has-error");
	}
	disableBtn();
});

// 监听确认密码输入框是否与密码框一致
$("#InputPassword2").bind("input propertychange", function() {
	if ($("#InputPassword2").val() == $("#InputPassword").val()) {
		$("#confirmPasswordGroup label").text("Password----OK");
		$("#confirmPasswordGroup").prop("class", "form-group has-success");
	} else {
		$("#confirmPasswordGroup label").text("Password----两次密码输入不一致");
		$("#confirmPasswordGroup").prop("class", "form-group has-error");
	}
	disableBtn();
});

function disableBtn() {
	if ($("#nicknameGroup").hasClass("has-success")
			&& $("#usernameGroup").hasClass("has-success")
			&& $("#passwordGroup" + "").hasClass("has-success")
			&& $("#confirmPasswordGroup").hasClass("has-success")) {
		$("#registBtn").prop("disabled", false);
	} else {
		$("#registBtn").prop("disabled", true);
	}
}