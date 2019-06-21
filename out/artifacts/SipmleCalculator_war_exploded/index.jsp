<%--
  Created by IntelliJ IDEA.
  User: adminu
  Date: 20/06/2019
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculate">

    <h2>Calculator</h2>
    <label> First operand </label>
    <input type="text" name="first-operand" placeholder="First Operand"/>
    <br>
    <label>Operator</label>
    <select name="operator">
      <option value='+'>+</option>
      <option value='-'>-</option>
      <option value='*'>*</option>
      <option value='/'>/</option>
    </select>
    <br>
    <label> Second operand</label>
    <input type="text" name="second-operand" placeholder="Second Operand"/>
    <input type="submit" value="Calculate"/>
  </form>
  </body>
</html>
