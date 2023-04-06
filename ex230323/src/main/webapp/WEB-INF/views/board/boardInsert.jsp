<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
<h2>게시글 등록</h2>

	<form action="boardInsert" method="POST">
		<div>
		<div>
			<label>번호 : <input type="text" name="bno" value="${boardInfo.bno}" readonly></label>
		</div>
		<div>
			<label>제목 : <input type="text" name="title"></label>
		</div>
		<div>
			<label>작성자 : <input type="text" name="writer"></label>
		</div>
		<div>
			<label>내용 : <textarea  rows="5" cols="33" name="contents"></textarea></label>
		</div>
		<div>
			<label>첨부 이미지 : <input type="text" name="image"></label>
		</div>
			<button type="submit">등록</button>
			<button type="button" onclick="location.href='getBoardList'">목록</button>
		</div>
	</form>
	
	<script>
		function formOptionChk(){
			let tilte= document.getElementsByname('title')[0];
			let writer= document.getElementsByname('writer')[0];
			let contents= document.getElementsByname('contents')[0];
			
			if(title.value == ""){
				alert('제목이 입력되지 않았습니다.')
				title.focus();
				return
			}
			if(writer.value == ""){
				alert('작가가 입력되지 않았습니다.')
				writer.focus();
				return
			}
			if(contents.value == ""){
				alert('내용이 입력되지 않았습니다.')
				contents.focus();
				return
			}
			
			insertForm.submit();
		}
		
		document.querySelector('button[type="submit"]')
			.addEventListener('click',formOptionChk);
	</script>
</body>
</html>