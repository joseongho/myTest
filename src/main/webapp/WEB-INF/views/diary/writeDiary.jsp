<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/www/diary/insertdiary" method="post">
		<label>title</label> <input type="text" name="title" maxlength="45" />
		<label>content</label> <input type="text" name="content"
			maxlength="500" /> <label>goodThing</label><input type="text"
			name="goodThing" maxlength="45" /> <label>badThing</label><input
			type="text" name="badThing" maxlength="45" /> <label>toDo</label><input
			type="text" name="toDo" maxlength="45" /> <input type="submit" />
	</form>

</body>
</html>