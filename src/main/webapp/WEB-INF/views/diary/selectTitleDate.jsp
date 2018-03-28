<%@page import="myModel.MyDiary"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href=<c:url value="/resources/styles.css"/>>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<%@ include file="/navigation.jsp"%>
	<div id="article">
		<table>
			<tbody>
				<tr>
					<td>number</td>
					<td>title</td>
					<td>date</td>
				</tr>
				<c:forEach begin="0" end="4" var="i">
					<tr>
						<td>${list.get(i).getNumber()}</td>
						<td><a href="/www/diary/selectNumber?number=${list.get(i).getNumber()}">${list.get(i).getTitle()}</a></td>
						<td>${list.get(i).getDate()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<%@ include file="/footer.jsp"%>
</body>
</html>