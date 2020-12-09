import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wanglingxing
 * @date 2020/12/8 8:34 下午
 */
/**
forward()方法
 1.forward（）方法在服务器端起作用。
 2.只有1个请求。转发到另一个Servlet的请求和原来请求是同一个。
 3.只能转发到当前服务器内部的资源。示例：request.getRequestDispacher("servlet2").forward(request，response);
 sendRedirect()方法
 1.sendRedirect（）方法在客户端运行。
 2.每次重定向都有2个请求。重定向到另一个Servlet的请求是由浏览器重新发出的新请求。
 3.重定向可以请求当前服务器内部的资源或者外部服务器资源。示例：request.getRequestDispacher("servlet2").forward(request，response);	示例：response.sendRedirect(" servlet2");
*/
 public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String kw = req.getParameter("keywords");
        resp.sendRedirect("https://www.baidu.com/s?wd=" + kw);
    }
}
