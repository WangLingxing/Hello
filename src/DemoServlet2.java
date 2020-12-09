import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wanglingxing
 * @date 2020/12/8 8:58 下午
 */
public class DemoServlet2 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = null;
        try{

            res.setContentType("text/html;charset=utf-8");
            out=res.getWriter();

            ServletContext context=getServletContext();
            String name = (String) context.getAttribute("name");

            out.println("欢迎您，" + name);

            out.close();

        }catch(Exception e){
            out.println(e);
        }
    }
}
