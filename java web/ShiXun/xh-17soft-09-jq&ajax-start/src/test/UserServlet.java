package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if ("findAllUser".equals(method)){
            this.findAllUser(request,response);
        }
    }

    /**
     * 查询所有用户
     */
    private void findAllUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("进入Servlet的findAllUser()");
        try {
            //设置响应文本编码
            response.setContentType("text/html;charset=utf-8");
            //创建并调用业务层对象
            UserService userService = new UserService();
            String json = userService.findAllUser();

            //在AJAX中，不能采用转发/重定向
            //只能采用IO流的方式，将服务器的数据响应给客户端
            response.getWriter().write(json);


        } catch (Exception e) {
            e.printStackTrace();

            //如果没有获取到数据，则返回"error"
            response.getWriter().write("error");

        }


    }
}
