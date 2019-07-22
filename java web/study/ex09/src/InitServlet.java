import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InitServlet")
public class InitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext application = this.getServletContext();

        //获取全局参数
        //用application.getInitParameter
        String encoding = application.getInitParameter("encoding");
        System.out.println("encoding参数是：" + encoding);

        //获取全局参数
        //用this.getInitParameter
        String driverClassName = this.getInitParameter("driverClassName");
        System.out.println("driverClassName参数是：" + driverClassName);
    }
}
