<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button type="button" onclick="location.href='Insert'">등록</button>
	<table>
		<thead>
			<tr>
				<th>상품ID</th>
				<th>이름</th>
				<th>단가</th>
				<th>담당자</th>
				<th>등록일자</th>
				<th>공급업체</th>
			</tr>
		</thead>
		<tbody>
			<!-- onclick으로 디테일 불러오기 하면 되긴 되는데, 아래 td에 delete이벤트의 이벤트 버블링 현상으로 삭제 버튼을 눌렀을때 여기 이벤트도 일어난다. -->
<!-- 			boardList는 컨트롤러에서 어떤 이름으로 보내주는가! attribute설정값을 보자 -->
			<c:forEach items="${pro }" var="pro">
				<tr>
					<td>${pro.productId }</td>
					<td>${pro.productName }</td>
					<td>${pro.productPrice }</td>
					<td>${pro.managerId }</td>
					<td><fmt:formatDate value="${pro.productDate }" pattern="yyyy/MM/dd"/></td>
					<td>${pro.company }</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>