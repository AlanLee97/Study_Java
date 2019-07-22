package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidateServlet")
public class ValidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String validateCode = request.getParameter("validateCode");
        HttpSession session = request.getSession();
        String randStr = (String)session.getAttribute("randStr");
        response.setCharacterEncoding("gb2312");
        PrintWriter out = response.getWriter();
        if (!validateCode.equals(randStr)){
            out.println("验证码错误");
        }else {
            out.println("验证码正确，跳转到LoginServlet。。。");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
