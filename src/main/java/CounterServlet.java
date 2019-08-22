
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CounterServlet extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        count++;
        request.setAttribute("count", count);
//        request.getRequestDispatcher("count.jsp").forward(request, response);

        response.getWriter().println("<h1> the Count is" + count + "!!</h1>");
    }
}

