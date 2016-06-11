<%@ page import="java.util.*" %>
<html>
<head>
    <title>Change contact</title>
</head>
<body>
<h1>Enter new data about contact:</h1>
<form action="/welcome">
<%
    List contact = (List)request.getAttribute("name");
    Iterator it = contact.iterator();

    while(it.hasNext()) {
        Object tmpit = it.next();
        out.print("<br>" + tmpit);
        out.print("<br> <input type=\"TEXT\">");
    }

%>
    <br><input type="SUBMIT">
</form>
<br>
<form>
    <input type="submit" value="Remove contact">
</form>
</body>
</html>
