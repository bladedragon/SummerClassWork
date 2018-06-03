<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>??</title>
    <meta http-equiv="Content-Type" content="application/json; charset=UTF-8">
</head>
<body>

<%
    String output = (String) session.getAttribute("objson");
    response.getWriter().printf("<li>" + output + "</li>");%>
   <%=session.getAttribute("text")%>

<div style="clear: both">
    <form action="UploadServlet " method="post">
        问题：<input type="text"  name="text"></br>
        <input type="submit" value="确认">
    </form>
    <%--<input id="msg" type="text" name="text"/>--%>
    <%--<button onclick=";">send</button>--%>
</div>

</body>
</html>
