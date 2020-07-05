<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>login-page</title>
</head>

<form:form action="${pageContext.request.contextPath}/blog/afterlogin" method="GET" modelAttribute="user">

enter username <form:input path="username"/>
<br><br>
enter password <form:input path="password"/>

<input type="submit" value="log-in">

</form:form>



</html>