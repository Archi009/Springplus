<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form onsubmit="return false">
		<div>
			<label>
				bno: <input type="text" name="bno" value="${boardInfo.bno }" readonly>
			</label>
		</div>
		<div>
			<label>
				제목: <input type="text" name="title" value="${boardInfo.title }" readonly >
			</label>
		</div>
		<div>
			<label>
				내용: <textarea  rows="5" cols="33">${boardInfo.contents }</textarea>
			</label>
		</div>
		<div>
			<label>
				이미지 : <c:choose>
						<c:when test="${not empty boardInfo.image }">
						<img src="<c:url value="/resources/images/${boardInfo.image }" />"
							style="width: 50%;"
							>
						</c:when>
					<c:otherwise></c:otherwise>
				</c:choose> 
				
			</label>
		</div>
		<div>
			<label>
				작성일 : <fmt:formatDate value="${boardInfo.regdate }" pattern="yyyy/MM/dd/"/> 
			</label>
		</div>
		
		<button type="button" onclick="location.href='boardUpdate?bno=${boardInfo.bno }'">수정</button>
		<button type="button" onclick="location.href='boardDelete?bno=${boardInfo.bno }'">삭제</button>
	</form>
</body>
<script>
	console.log(${not empty boardInfo.image });
</script>
</html>