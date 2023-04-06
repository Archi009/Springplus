<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>도서 죄회 수정</h3>

	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${bookList}" var="book">
	<tr>
		<td>${book.bookNo}</td>
		<td>${book.bookName}</td> 
		<td>${book.bookCoverimg}</td> 
		<td><fmt:formatDate value="${book.bookDate}" pattern="yyyy/MM/dd"/></td>
		<td><fmt:formatNumber value="${book.bookPrice}" pattern="#,###" /></td>
		<td>${book.bookPublisher}</td>
		<td>${book.bookInfo}</td>
	</tr>
</c:forEach>
		</tbody>
	</table>





</body>
</html>