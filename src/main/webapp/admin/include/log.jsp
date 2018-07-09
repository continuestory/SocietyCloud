<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/8
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看日志</title>
</head>

<body>
<jsp:useBean id="logs" type="java.util.List<util.function.Log>" scope="session"/>


<center>
    <table border="1">
        <tr>
            <th>日志时间</th>
            <th>日志内容</th>
            <th>日志类型</th>
            <th>日志属性</th>
        </tr>



        <c:forEach var="log" items="${logs}">
            <c:if test="${log.type.equals(\"event\")}">
                <tr>
                    <td><font color="gray">${log.time}</font></td>
                    <td><font color="gray">${log.log}</font></td>
                    <td><font color="gray">${log.type}</font></td>
                    <td><font color="gray">${log.attribute}</font></td>
                </tr>
            </c:if>
            <c:if test="${log.type.equals(\"error\")}">
                <tr>
                    <td><font color="#8b0000">${log.time}</font></td>
                    <td><font color="#8b0000">${log.log}</font></td>
                    <td><font color="#8b0000">${log.type}</font></td>
                    <td><font color="#8b0000">${log.attribute}</font></td>
                </tr>
            </c:if>
            <c:if test="${log.type.equals(\"user\")}">
                <tr>
                    <td><font color="#b8860b">${log.time}</font></td>
                    <td><font color="#b8860b">${log.log}</font></td>
                    <td><font color="#b8860b">${log.type}</font></td>
                    <td><font color="#b8860b">${log.attribute}</font></td>
                </tr>
            </c:if>
            <c:if test="${log.type.equals(\"society\")}">
                <tr>
                    <td><font color="#8b008b">${log.time}</font></td>
                    <td><font color="#8b008b">${log.log}</font></td>
                    <td><font color="#8b008b">${log.type}</font></td>
                    <td><font color="#8b008b">${log.attribute}</font></td>
                </tr>
            </c:if>
            <c:if test="${log.type.equals(\"admin\")}">
                <tr>
                    <td><font color="#00008b">${log.time}</font></td>
                    <td><font color="#00008b">${log.log}</font></td>
                    <td><font color="#00008b">${log.type}</font></td>
                    <td><font color="#00008b">${log.attribute}</font></td>
                </tr>
            </c:if>
        </c:forEach>
    </table>
    <form method="post" action="admin">
        <input type="submit" value="刷新">
        <%
            request.setAttribute("admin","log");
        %>
    </form>
</center>



</body>
</html>
