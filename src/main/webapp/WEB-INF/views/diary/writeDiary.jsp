<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href=<c:url value="/resources/styles.css"/>>
</head>
<body>
	<div id="container">
		<%@ include file="/header.jsp"%>
		<%@ include file="/navigation.jsp"%>
		<div id="article">
			<form action="/www/diary/insertdiary" method="post">
				<p>title</p>
				<input type="text" name="title" maxlength="45" />
				<p>content</p>
				<textarea name="content" rows="20"></textarea>
				<p>goodThing</p>
				<input type="text" name="goodthing" maxlength="45" />
				<p>badThing</p>
				<input type="text" name="badthing" maxlength="45" />
				<p>toDo</p>
				<input type="text" name="todo" maxlength="45" /> <input
					type="submit" />
			</form>
		</div>
		<%@ include file="/footer.jsp"%>
	</div>
</body>
</html>