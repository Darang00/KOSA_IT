<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<header>
    
    <div class="title">
    	<a href="index.do">Main(index페이지 호출)</a>
    </div>
    
    <div class="links">        
        <c:forEach var="cate" items="${requestScope.categoryList}">
			<tr>
				<td>${cate.boardname}</td>

			</tr>
		</c:forEach>
		<c:choose>
			<c:when test="${sessionScope.userid ne null}">
			    <a href="logout.do"><i></i>
			    <span>Sign Out</span></a>
			    <jsp:forward page="/session.do"/>
			</c:when>
			<c:otherwise>
			   <a href="login.do">
			   <span>Sign in</span></a>
			</c:otherwise>
		</c:choose>
		
		
		<c:choose>
			<c:when test="${requestScope.categoryList ne null}">
					null이 아니면
			</c:when>
			<c:otherwise>
			   널이면
			  <%--  <jsp:forward page="/category.do"/> --%>
			</c:otherwise>
		</c:choose>

    </div>         
</header>