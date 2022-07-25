<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者ログイン画面</title>
</head>
<body>
	<form action="servlet01/model/u_login.java" method="post">
		ID&nbsp; <input type= "text" name = "id"><br><br>
		パスワード&nbsp; <input type= "text" name = "pass"><br><br>

		<input type = "submit" value = "ログイン"><br>
		<a href="topmenu">戻る</a>
		<a href="u_entry_1">新規登録はこちら</a>
	</form>
</body>
</html>