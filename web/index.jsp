<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login form</title>
  <link href="bootstrap.css" type="text/css" rel="stylesheet">
</head>
  <body>
  <h1 class="text-center">Login</h1>
  <form action="" method="POST">
    <table align="center">
      <tr>
        <th align="right">Username:</th>
        <td><input type="text" name="txtusername" placeholder="Username" class="input-group-text"></td>
      </tr>
      <tr>
        <th align="right">Password:</th>
        <td><input type="password" name="txtpassword" placeholder="Password" class="input-group-text"></td>
      </tr>
      <tr>
        <td colspan="2" align="right"><input type="submit" value="Log In" class="btn btn-primary"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
