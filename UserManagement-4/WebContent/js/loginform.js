function validate() {
	alert("Inside validate");
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;

	if (username == "") {
		var divNote = document.getElementById("usernameError");
		divNote.innerHTML = "This div generated by javascript";

		// alert("Username cannot be blank");
		// return false;
	}

	else if (password == "") {
		alert("password cannot be balnk");
		return false;
	} else {
		var form = document.getElementById("frm");
		form.action = "login.do";
		form.submit();
	}

}
