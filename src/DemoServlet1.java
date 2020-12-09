import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wanglingxing
 * @date 2020/12/8 8:57 下午
 */
public class DemoServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        PrintWriter out = null;
        try{

            res.setContentType("text/html;charset=utf-8");
            out=res.getWriter();

            ServletContext context=getServletContext();
            context.setAttribute("name","wlx");

            out.println("这是DemoServlet1");
            out.println("<a href='demoservlet2'>点击跳转</a>");
            out.close();

        }catch(Exception e){
            out.println(e);
        }
    }
}

