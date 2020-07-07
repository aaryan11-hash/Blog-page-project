<%--
  Created by IntelliJ IDEA.
  User: Aaaryan
  Date: 07-07-2020
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome The Home Page!!
<br><br>
Your UserName:${user.username}
Your Age:${user.age}
Your preffered Genre:<c:forEach var="user1" items="${user.prefferedGenre}"> ${user1}</c:forEach>
<br><br>

YOUR RECOMMENDATIONS
<!--this part is for suggesting blogs from bloggers who this current user follows-->
<!--future code will auto suggest on the basis of likes/followers of popular bloggers as well -->
<br><br>


</body>
</html>
