<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	var check = function() {
		if (document.getElementById('passwordnew').value == document
				.getElementById('passwordnewconfirm').value) {
			document.getElementById('message').style.color = 'white';
			document.getElementById('message').innerHTML = 'matching';
			return true;
		} else {
			document.getElementById('message').style.color = 'red';
			document.getElementById('message').innerHTML = 'Password does not match';
			return false;
		}
	}
</script>
</head>
<body>
	<h1 align="center">login page</h1>
	<!--login form -->
	<div class="container" align="center">
		<form action="login" method="post">
			<div>
				<label for="username">Enter Username:</label> <input type="text"
					id="username" placeholder="Enter username" name="username">
			</div>
			<div>
				<label for="pwd">Enter Password:</label> <input type="password"
					id="password" placeholder="Enter password" name="password">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
		<span id='messageindex'><%=request.getAttribute("message1")%></span>
		<%   if (request.getAttribute("message1")!=null || request.getAttribute("message") !=null){ %>
		<span id='message1'><%=request.getAttribute("message1")%></span>
		 <span id='message'><%=request.getAttribute("message")%></span> 
			
			<%} %>
		<button style="float: right" type="button"
			class="btn btn-info a-btn-slide-text" data-toggle="modal"
			data-target="#registerModal">Register yourself</button>

		<!-- modal  -->
		<div class="modal fade" id="registerModal" role="dialog">
			<div class="modal-dialog">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Register Here !!!</h4>
					</div>
					<div>
						<form action="register" method="post">
							<input type="text" name="username" placeholder="Confirm Username"
								required> <br /> <input type="text" name="fullname"
								placeholder="Confirm Full Name" required> <br /> <input
								type="password" name="password" id="password"
								placeholder="New Password"> <br /> <input type="submit"
								value="register">
							<hr />
							<span id='message'><%=request.getAttribute("message")%></span>

						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>



		<!-- reset your password  -->
		<button style="float: left" type="button"
			class="btn btn-info a-btn-slide-text" data-toggle="modal"
			data-target="#resetModal">Forgotten your Password</button>


		<!-- Modal -->
		<div class="modal fade" id="resetModal" role="dialog">
			<div class="modal-dialog">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Reset Your Password</h4>
					</div>
					<div>
						<form action="reset" method="post"
							onsubmit="return check()">
							<input type="text" name="username" placeholder="Confirm Username"
								required> <br /> <input type="text" name="fullname"
								placeholder="Confirm Full Name" required> <br /> <input
								type="password" name="passwordnew" id="passwordnew"
								placeholder="New Password" onkeyup='check();' required>
							<br /> <input type="password" name="passwordnewconfirm"
								id="passwordnewconfirm" placeholder="Confirm new password"
								onkeyup='check();' required> <br /> <input
								type="submit" value="reset">
							<hr />
							<span id='message1'><%=request.getAttribute("message1")%></span>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>