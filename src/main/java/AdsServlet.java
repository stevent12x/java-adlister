import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Ad> ads = DaoFactory.getAdsDao().all();
        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/adslist.jsp").forward(req,res);
    }
}
