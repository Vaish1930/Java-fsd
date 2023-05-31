<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Session Logout</title>
  </head>
  <body>
    <% session.invalidate();%>
    <b>Your Session has been terminated</b></br>
    <a href="session.jsp">Login again</a>
  </body>
</html>
