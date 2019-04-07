<html>
<head>
	<title>ログイン成功</title>
</head>
<body>
	<h2>ログイン成功！</h2>
	<div>
		<span><c:out value="${loginForm.username}" />さん、ようこそ！</span>
	</div>
	<div>
		<a href="<c:url value="/" />">入力画面へ戻る</a>
	</div>
</body>
</html>