package login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        System.out.println("实例化LoginServlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("已进入LoginServlet.jsp");

        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String loginState = "Fail";
        String targetUrl = "/loginFail.jsp";



        if (account.equals(password)){
            loginState = "Success";
            System.out.println(loginState);
            targetUrl = "/loginSuccess.jsp";
            HttpSession session = request.getSession();
            session.setAttribute("account", account);
        }
        request.setAttribute("loginState", loginState);
        System.out.println(loginState);
        ServletContext application = this.getServletContext();
        RequestDispatcher rd = application.getRequestDispatcher(targetUrl);
        rd.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
