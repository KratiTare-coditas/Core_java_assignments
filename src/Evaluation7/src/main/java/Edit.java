import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/Edit")

public class Edit extends HttpServlet {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletContext context = req.getServletContext();
        PrintWriter out = resp.getWriter();
        try {
            Class.forName(context.getInitParameter("driver"));
            con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));
            ps = con.prepareStatement(" update registration set city='pune' where firstname='mrunmai'");
            ps.executeUpdate();
            out.println("Updation done!!");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Admin");
            requestDispatcher.include(req, resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}