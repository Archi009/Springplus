<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="sb-sidenav accordion sb-sidenav-light" id="sidenavAccordion">
	<div class="sb-sidenav-menu">
		<div class="nav">
			<div class="sb-sidenav-menu-heading">Web</div>
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}/empInsert">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 회원 등록
			<a class="nav-link" href="${pageContext.request.contextPath}/empList">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div>  회원조회/수정
			
			
			
			
			
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}/insertBook">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 도서등록
			<a class="nav-link" href="${pageContext.request.contextPath}/getListBook">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div>  도서목록 조회/수정
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}/getRent">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 대여현황 조회
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}/rentList">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 홈으로
			</a>
		</div>
	</div>
</nav>