// 监听用户名输入框是否有空格
$("#InputUsername").bind("input propertychange", function() {
	if ($("#InputUsername").val().indexOf(" ")>=0) {
		$("#usernameGroup").prop("class", "form-group has-error");
		$("#usernameGroup label").text("Username----用户名不能还有空格");
	}
});

$("#InputUsername").blur(function() {
	if($("#InputUsername").val() == null) {
		$("#usernameGroup").prop("class", "form-group has-error");
		$("#usernameGroup label").text("Username----用户名不能为空");
	} else {
		if($("#InputUsername").hasClass("has-error")){
			//do nothing
		} else {
			$("#usernameGroup label").text("Username");
			$("#usernameGroup").prop("class", "form-group");
		}
	}
});

//监听密码输入框是否有空格
$("#InputPassword").bind("input propertychange", function() {
	if ($("#InputPassword").val().indexOf(" ")>=0) {
		$("#passwordGroup").prop("class", "form-group has-error");
		$("#passwordGroup label").text("Password----用户名不能还有空格");
	}
});

$("#InputPassword").blur(function() {
	if($("#InputPassword").val() == null) {
		$("#passwordGroup").prop("class", "form-group has-error");
		$("#passwordGroup label").text("Password----密码不能为空");
	} else {
		if($("#InputPassword").hasClass("has-error")){
			//do nothing
		} else {
			$("#passwordGroup label").text("Password");
			$("#passwordGroup").prop("class", "form-group");
		}
	}
});
