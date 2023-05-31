<jsp:useBean id="obj" class="com.example.Calculator" />
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <% int m=obj.cube(5); out.print("cube of 5 is "+m); %>
  </body>
</html>
