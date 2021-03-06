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
        <br/>
        <div class="row">
            <div class="col-sm-10"></div>
            <%--<div class="col-sm-2">로그아웃/ alarm 부분</div>--%>
            <div class="col-sm-2"></div>
        </div>

        <br/><br/><br/><br/>

        <div class="row" style="text-align:center">
            <a href="/notice/noticeList" class="btn btn-primary" role="button"> 공지사항 보기</a>
        </div>

        <br/><br/><br/>

        <div class="row" style="text-align:center">
            <a href="/message/" class="btn btn-primary" role="button"> 쪽지함</a>
        </div>
        <br/><br/><br/>

    </sec:authorize>


</div>


</body>
</html>
