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
        <h1>공지사항 등록</h1>
        <div class="table-responsive">
            <table class="table table-hover">
                <form action="/notice/uploadNotice", method="POST">
                    <tr>
                        <td>&nbsp;</td>
                        <td align="center">제목</td>
                        <td><input name="title" size="50" maxlength="100"></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>


                    <tr>
                        <td>&nbsp;</td>
                        <td align="center">내용</td>
                        <td><textarea name="content" cols="50" rows="13"></textarea></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td align="center">글쓴이</td>
                        <td><input name="user_name" size="50" maxlength="50" value="${user.name}" readonly></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr height="1" bgcolor="#82B5DF"><td colspan="4"></td></tr>
                    <tr align="center">
                        <td>&nbsp;</td>
                        <td colspan="2"><input class="btn btn-primary" type=submit value="등록">
                            <a href="/notice/noticeList" class="btn btn-primary" role="button"> 취소</a>
                        <td>&nbsp;</td>
                    </tr>
                </form>
            </table>
        </div>

    </sec:authorize>
</div>


</body>
</html>
