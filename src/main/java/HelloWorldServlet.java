import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String name = req.getParameter("name");
        System.out.println("Welcome " + name + "!");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, " + name + "!</h1>");

    }
}

// finished //
