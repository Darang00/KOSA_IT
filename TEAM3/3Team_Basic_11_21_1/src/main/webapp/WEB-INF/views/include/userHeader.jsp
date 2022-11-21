<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<header>
    
    <div class="title">
    	<a href="${pageContext.request.contextPath}">Main(index페이지 호출)</a>
    </div>
    
    <div id="menu">
            <div>
                <ul>
<%-- 	                <jsp:forward page="/category.do"/> --%>
	                
	                <c:forEach var="cate" items="${requestScope.categoryList}">
								<tr>
									<td><a href="boardList.user?boardname=${cate.boardname}"}>${cate.boardname}</a> </td>
								</tr>
							</c:forEach>
	                
                	<!-- a : 페이지 이동을 처리하는 마크업 -->
                	<!-- <li><a href="boardList.user">트러블 슈팅</a></li>
					<li><a href="">질문과 답변</a></li>
					<li><a href="">프로젝트 모집</a></li>
					<li><a href="">자유게시판</a></li>
					<li><a href="">공지사항</a></li>
                    <li><a href="boardList.user">BOARD LIST</a></li>
					<li><a href="boardWrite.user">BOARD WRITE</a></li> -->
					<!--
					<li><a href="javscript:void(0);"></a></li>
					<li><a href="javscript:void(0);"></a></li> -->
                </ul>
            </div>
        </div>
        
        <div class="links">        		
			<c:choose>
				<c:when test="${sessionScope.userid ne null}">
				 	${sessionScope.id } 님
				    <a href="logout.do"><i></i>
				    <span>Sign Out</span></a>
				</c:when>
				<c:otherwise>
				   <a href="login.do">
				   <span>Sign in</span></a>    
				</c:otherwise>
			</c:choose>
    	</div>
    
        <div style="text-align:right;margin-top:1px;
        	border:solid 1px;padding:5px">
        	[ TOTAL : 명 ]
        	[ CURRENT : 명 ]
        </div>      
</header>