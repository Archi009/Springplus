<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
<form name="updateForm" action="boardUpdate" method="POST"  >
		<div>
			<label>
				번호: <input type="text" name="bno" value="${boardInfo.bno }" readonly>
			</label>
		</div>
		<div>
			<label>
				제목: <input type="text" name="title" value="${boardInfo.title }"  >
			</label>
		</div>
		<div>
			<label>
				작성자: <input type="text" name="writer" value="${boardInfo.writer }" readonly >
			</label>
		</div>
		<div>
			<label>
				내용: <textarea  rows="5" cols="33">${boardInfo.contents }</textarea>
			</label>
		</div>
		<div>
			<label>
				수정날짜 : <input type="text" name="updatedate"   readonly>
			</label>
		</div>
		<div>
			<label>
				이미지 : <img src="${boardInfo.image }" >
			</label>
		</div>
	
		
		<button type="submit">수정</button>
		<button type="button" onclick="location.href='getBoardInfo?bno=${boardInfo.bno }'">취소</button>
	</form>
	<script>
		function formOptionChk(){
			let tilte= document.getElementsByname('title')[0];
			let contents= document.getElementsByname('contents')[0];
			
			if(title.value == ""){
				alert('제목이 입력되지 않았습니다.')
				title.focus();
				return
			}
			if(contents.value == ""){
				alert('내용이 입력되지 않았습니다.')
				contents.focus();
				return
			}
			
			updateForm.submit();
		}
		
		document.querySelector('button[type="submit"]')
			.addEventListener('click',formOptionChk);
	</script>
</body>
</html>