<html>
  <head>
    <title>Servlet</title>
    <style>
      body {
        background: grey;
      }
    </style>
  </head>
  <body>
    <h2>Hello World!</h2>
    <br />
    <a href="/project5/test">Go to Test</a>
    <form action="/project5/test" method="post">
      <input
        type="hidden"
        placeholder="Enter your name"
        name="fullName"
        value="Vaishnavi"
      />
      <button type="submit">Save</button>
    </form>
    <br />
    <a href="/project5/generic-test">Go to Generic servlet</a>
    <br />
    <a href="/project5/interface-test">Go to Interface servlet</a>
    <br />
    <a href="/project5/session-tracking">Go to session-tracking</a>
  </body>
</html>
