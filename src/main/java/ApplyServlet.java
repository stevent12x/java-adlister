import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionsServlet", urlPatterns = "/apply")
public class ApplyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Get the session attribute named "program so we can decide the price"
        String program = (req.getSession().getAttribute("program") == null) ? "" : (String) req.getSession().getAttribute("program");
            if (program.equals("DS")){
                req.setAttribute("price", 10);
            }else{
                req.setAttribute("price", 11);
            }
        req.getRequestDispatcher("apply.jsp").forward(req,resp);
    }
}
