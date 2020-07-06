<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign-up</title>
</head>

<body>
<form:form action="${pageContext.request.contextPath}/blog/profileBuilder" method="GET" modelAttribute="newuser">
Enter UserName<form:input path="username"/>
<br><br>
Enter Password<form:input path="password"/>

<input type="submit" value="Proceed">

</form:form>
</body>

</html>