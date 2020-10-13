<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>

    <body>
        <h3>测试程序</h3>
        <a href="param/getParams">参数</a>


        <form action="param/getMultiParams" method="post">
            姓名：<input type="text" name="name" />
            年龄：<input type="text" name="age" />
            性别：<input type="text" name="sex" />
            花名：<input type="text" name="subUserInfo.nick" />
            工号：<input type="text" name="subUserInfo.staffId" />
            生日：<input type="text" name="date" />
            <input type="submit" value="提交">
        </form>

    </body>
</html>