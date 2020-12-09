<%--
  Created by IntelliJ IDEA.
  User: wanglingxing
  Date: 2020/12/8
  Time: 7:29 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Servlet</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
  </head>
  <body>
    <form action="servlet1" method="post">
      【请求转发/包含】<br/>
      <br/>
      用户名：<input type="text" name="username"/><br/>
      密码：<input type="password" name="password"/><br/>
      <input type="submit" value="登录"/>
    </form>
    <br/>
    <br/>
    <br/>
    <br/>
    【重定向】
    <form action="search">
      <input type="text" name="keywords">
      <input type="submit" value="百度搜索">
    </form>
    <br/>
    <br/>
    <br/>
    <br/>
  【过滤器】
  <a href="targetservlet1">点击这里</a>
  </body>
</html>
