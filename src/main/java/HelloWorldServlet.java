import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String name = req.getParameter("name");
        System.out.println("Welcome " + name + "!");

        res.setContentType("text/html");
        counter +=1;
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, " + name + "!</h1><br><h4>Visits: " + counter + "</h4>");
    }
}

// finished //
