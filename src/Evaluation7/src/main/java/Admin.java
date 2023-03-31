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

@WebServlet("/Admin")
public class Admin extends HttpServlet {


    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        ServletContext context= req.getServletContext();
        HttpSession session= req.getSession();
        try {
            Class.forName(context.getInitParameter("driver"));
            con= DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
            ps=con.prepareStatement("select * from registration");
            rs=ps.executeQuery();
            while(rs.next())
            {
               // if(rs.getString(3)=="admin")

                    String firstname=req.getParameter("firstname");
                    String username=req.getParameter("username");
                    String password=req.getParameter("password");
                    String city=req.getParameter("city");
                    String role=req.getParameter("role");
                    out.println("Firstname:"+rs.getString(1));
                    out.println("Username::"+rs.getString(2));
                    out.println("City::"+rs.getString(4));



            }
            out.println("<a href='Delete'>Delete</a>");
            out.println("<a href='Edit'>Edit</a>");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {


        }

    }
}
