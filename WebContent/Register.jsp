<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="R1.css">
</head>
<body>
<div class="container-fluid">
<div class="row">
<div class="col-6" style="margin-top:190px"  title="Welcome!!">
<span>Sign In</span>
</div>
<div class="col-6 mt-2 " >
<form onsubmit="return register()" method="post">
<label for="name"><i>Name</i></label><span id="sp1"></span>
<input type="text" id="name" class="form-control" placeholder="Firstname" >
<label for="email"><i>Email</i></label>
<input type="text" id="email"class="form-control"placeholder="Email" >
<label for="username"><i>Username</i></label><span id="sp2"></span>
<input type="text" id="username"class="form-control"placeholder="Username">
<label for="password1"><i>Password</i></label>
<input type="password" id="password1"class="form-control"placeholder="Password">
<input type="password" id="password2"class="form-control mt-3"placeholder="Retype-Password" onchange="retype()">
<input type="checkbox" class="mt-3" onclick="showpassword()">
<label>Show Password</label><br/>
<label>Gender</label>
	<div class="ml-5">
		<input type="radio" name="sex" value="male"> Male<br/>
		<input type="radio" name="sex" value="male"> Female<br/>
		<input type="radio" name="sex" value="male"> Trans gender<br/>
	</div>
<button type="submit"  class="submit  mt-3" style="outline:none">Submit</button>
</form>
</div>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script>
//var name = document.getElementById("name").value.trim();
function register(){
	var name = document.getElementById("name").value.trim();
	var user = document.getElementById("username").value.trim();
	var pass1=document.getElementById("password1").value.trim();
	var pass2=document.getElementById("password2").value.trim();
	if(namevalidation(name)&&uservalidation(user)){
		alert("success");
	return true;
	console.log(name);
	}
	/* else if(){
		
	} */
	else{
		return false;
		
	}
	}
	
	//name validation//
	function namevalidation(name){
	var pattern="^[A-Za-z ]+$";
	 if(name==""){
		document.getElementById("sp1").innerHTML="plz dont leave empty";
		document.getElementById("sp1").style.color="red";
		return false;
	} 
	
	 else if(name.match(pattern)!=null){
	return true;
	}
	else{
		document.getElementById("sp1").innerHTML="plz valid name";
		document.getElementById("sp1").style.color="red";
	return false;
	}
	}
	//user validation//
	function uservalidation(user)
	{
	var pattern="^[A-Za-z0-9 ]+$";
	if(user.match(pattern)!=null){
	return true;
	}
	else if(user==""){
		document.getElementById("sp2").innerHTML="plz dont leave empty";
		document.getElementById("sp2").style.color="red";
		return false;
	}
	else{
		document.getElementById("sp2").innerHTML="plz valid name";
		document.getElementById("sp2").style.color="red";
	return false;
	}
	}

	// password validation//
	function passvalidation(pass1,pass2){
		var pattern="^[A-Za-z0-9 !@#$%^&*]+$";
		if(pass1.match(pattern)!=null&&pass2.match(pattern)!=null){
			alert("success");
			return true;
		}
		else{
			return false;
		}
	}
	// retype pass//
	function retype(){
		var pass1=document.getElementById("password1").value.trim();
		var pass2=document.getElementById("password2").value.trim();
		if(pass1==pass2 && pass1==null){
			return true;
		}
		else{
			alert("password miss match");
			return false;
		}
	}
	//show password//
	function showpassword(){
		var pass1=document.getElementById("password1");
		var pass2=document.getElementById("password2");
		console.log(pass1);
		if(pass1.type=="password"){
			pass1.type="text";
			pass2.type="text";
		}
		else{
			pass1.type="password";
			pass2.type="password";
		}
	}
</script>
</body>
</html>