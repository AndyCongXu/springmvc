<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>

    <body>
        <h3>注解测试程序</h3>
        <a href="/annotation/requestParam">注解测试程序</a>

        <form action="annotation/requestBody" method="post">
                            姓名：<input type="text" name="name" />
                            年龄：<input type="text" name="age" />
                            <input type="submit" value="提交">
        </form>
    </body>
</html>