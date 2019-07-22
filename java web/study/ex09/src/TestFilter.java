import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {
    TestFilter(){
        System.out.println("构造函数");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化函数");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter函数");
    }

    @Override
    public void destroy() {
        System.out.println("destroy函数");
    }
}
