<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Session JSP</title>
  </head>
  <body>
    <% if(request.getParameter("error")!=null) out.println("<b>Your Session has expired or is invalid</b></br>"); %>
     <form action="login.jsp" method="po
     ">
      Name <input name="name" id="name" maxlength="40"></br>
      Password <input type="password" name="password" id="password" maxlength="10"></br>
    <button>Submit</button>
    </form>
  </body>
</html>
