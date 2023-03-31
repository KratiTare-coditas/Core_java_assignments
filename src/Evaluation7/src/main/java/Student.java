import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/Student")

public class Student extends HttpServlet {
    Connection con;

    PreparedStatement ps;
    ResultSet rs;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        ServletContext context = req.getServletContext();
        HttpSession session = req.getSession();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            Class.forName(context.getInitParameter("driver"));
            con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));

//            ps = con.prepareStatement("select * from registration");
//            rs = ps.executeQuery();
//            while (rs.next()) {
//
               ps=con.prepareStatement("select * from login where role='student'");
               rs=ps.executeQuery();
               while(rs.next()) {
                   String name = rs.getString(1);
                   String role = rs.getString(3);
                   out.println("<h1>Name::" + name);
                   out.println("<h2>Role::" + role);
               }
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
