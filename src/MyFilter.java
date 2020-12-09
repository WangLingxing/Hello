import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wanglingxing
 * @date 2020/12/8 9:19 下午
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html;charset=utf-8");

        PrintWriter out=servletResponse.getWriter();
        out.print("在目标资源之前");

        filterChain.doFilter(servletRequest, servletResponse);
        out.print("在目标资源之后");

    }

    @Override
    public void destroy() {

    }
}
