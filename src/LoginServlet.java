import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wanglingxing
 * @date 2020/12/8 8:09 下午
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("wlx")  && password.equals("1234")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("servlet2");
            requestDispatcher.forward(req, resp);
        } else {
            out.print("抱歉，用户名或密码错误！");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
            requestDispatcher.include(req, resp);
        }

    }
}
