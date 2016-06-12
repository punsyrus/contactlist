<%@ page import="java.util.*" %>
<html>
<head>
    <title>Change contact</title>
</head>
<body>
<h1>Enter new data about contact:</h1>
<form method="POST" action="/create">
    <%
        List contact = (List)request.getAttribute("name");
        Iterator it = contact.iterator();

        while(it.hasNext()) {
            Object tmpit = it.next();
            out.print("<br>" + tmpit);
            out.print("<br> <input type=\"TEXT\" required name=\"" + tmpit + "\">");
        }

    %>
    <br><input type="SUBMIT">
</form>
<br>
</body>
</html>
