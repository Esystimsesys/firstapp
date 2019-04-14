<html>
<head>
	<title>ログイン</title>
</head>
<body>
	<h2>ログイン</h2>
	<form:form modelAttribute="loginForm">
		<div>ユーザ名</div>
		<div>
			<form:input path="username" />
			<form:errors path="username" />
		</div>
		<div>パスワード</div>
		<div>
			<form:password path="password" />
			<form:errors path="password" />
		</div>
		<div>
			<form:button>送信</form:button>
		</div>
	</form:form>
</body>
</html>