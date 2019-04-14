<html>
<head>
	<title>出力画面</title>
</head>
<body>
	<h2>出力画面</h2>
	<div>入力したテキストは・・・</div>
	<div>
		「<span><c:out value="${echoForm.text}" /></span>」
	</div>
	<div>
		<a href="<c:url value="/" />">入力画面へ戻る</a>
	</div>
</body>
</html>