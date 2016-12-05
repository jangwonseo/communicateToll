<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>testing test.jsp</title>
</head>
<body>
<h1>testIndex.jsp</h1>
<%--여기서 action 속성의 값으로 어디로 전송될건지 주소가 들어가야 한다--%>
<%--그리고 주소는 현재주소가 베이스 인듯하다...--%>
<%--<form action="/testing/student", method="get">--%>
    <%--학생 아이디 :  <input type="text" name="id"> <br/>--%>
    <%--<input type="submit" value="전송하시오">--%>
<%--</form>--%>

<form action="/testing/student", method="POST">
    학생 아이디 :  <input type="text" name="id"> <br/>
    <input type="submit" value="전송하시오">
</form>
</body>
</html>
