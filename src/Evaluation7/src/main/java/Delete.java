import com.sun.net.httpserver.HttpContext;

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

@WebServlet("/Delete")

public class Delete extends HttpServlet {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        PrintWriter out = resp.getWriter();
        try {
            Class.forName(context.getInitParameter("driver"));
            con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));
            ps = con.prepareStatement("delete from registration where firstname='yash'");
            ps.executeUpdate();
            out.println("Deletion done!!");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Admin");
            requestDispatcher.include(req, resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
