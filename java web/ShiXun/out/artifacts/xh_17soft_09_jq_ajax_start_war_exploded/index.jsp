<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/7/9
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery-3.3.1.min.js"></script>
  </head>
  <body>
  <table align="center" border="1" id="table" width="80%">
    <%--<tr>--%>
      <%--<th>编号</th>--%>
      <%--<th>姓名</th>--%>
      <%--<th>密码</th>--%>
      <%--<th>邮箱</th>--%>
    <%--</tr>--%>
  </table>



  <script>

    /**
     * 使用jquery实现ajax
     * $.get(url,data,callback,type)
     */
    $(function () {
        //url为请求服务器的路径
        var url = "${pageContext.request.contextPath}/user";
        //data为向服务器发送的数据，支持字符串或json对象
        var data = "method=findAllUser";
        //callback为服务器返回后的回调函数（无名函数）
        var callback = function(userList){
          // alert(userList);

          if ("error" != userList){
              var content = "<tr>\n" +
                      "      <th>编号</th>\n" +
                      "      <th>姓名</th>\n" +
                      "      <th>密码</th>\n" +
                      "      <th>邮箱</th>\n" +
                      "    </tr>";



              //将服务器中返回的数据拆解
              for (var i = 0; i < userList.length; i++) {
                var user = userList[i];

                //用js解析json对象
                var uid = user.uid;
                var username = user.username;
                var password = user.password;
                var email = user.email;


                //将各个变量在table中输出
                content += "<tr>\n" +
                        "          <td>"+uid+"</td>\n" +
                        "          <td>"+username+"</td>\n" +
                        "          <td>"+password+"</td>\n" +
                        "          <td>"+email+"</td>\n" +
                        "        </tr>";

              }

              //将content的值放到table标签中
              var table = document.getElementById("table");
              table.innerHTML = content;

            }


        }
        //type为Jquery框架将服务器返回的结果转成text字符串或json对象
        var type = "json";

        $.get(url,data,callback,type);
    });
  </script>
  </body>
</html>
