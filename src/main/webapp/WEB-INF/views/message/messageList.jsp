<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="user" value="${SPRING_SECURITY_CONTEXT.authentication.principal}"/>
<%--<%@include file="/WEB-INF/views/include/header/top.jsp"%>--%>
<!DOCTYPE html>
<html lang="en">

<html>
<head>
    <title>testing test.jsp</title>
    <meta charset="utf-8">
    <%--To ensure proper rendering and touch zooming, add the following <meta> tag inside the <head> element:--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--<script src="/resources/jquery/jquery-3.1.1.js" type="text/javascript"></script>--%>
    <%--<script src="/resources/bootstrap/js/bootstrap.js" type="text/javascript"></script>--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%--you cannot put a container inside another container--%>
<div class="container">
    <sec:authorize access="isAuthenticated()">
        <h1>${user.name}님의 쪽지함입니다.</h1>
        <div class="table-responsive">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>보낸이</th>
                    <th>시간</th>
                    <th>내용</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="messageList" items="${messageList}">
                    <tr>
                        <td>${messageList.sendName}</td>
                        <td>${messageList.sendTime}</td>
                        <td>${messageList.content}</td>
                    </tr>

                </c:forEach>

                </tbody>
            </table>
        </div> <%-- table-responsive--%>

        <div class="row" style="text-align:center">

            <a href="/message/sendMessage" class="btn btn-primary" role="button"> 쪽지 보내기</a>
        </div>
        <br/>
        <div class="row" style="text-align:center">

            <a href="/home" class="btn btn-primary" role="button"> 홈으로</a>
        </div>





    </sec:authorize>
</div>


</body>
</html>
