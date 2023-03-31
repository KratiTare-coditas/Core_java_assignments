import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
    Connection con;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        ServletContext context = req.getServletContext();
        HttpSession session = req.getSession();
        if(session.getAttribute("username")==null)
        {
            resp.sendRedirect("index.html");
        }
        else {
            String name = (String) session.getAttribute("username");
            out.println("Hey,Welcome::" + name);
            out.println("<a href='Admin' >Admin</a>");
            out.println("<a href='Student' >Student</a>");
            out.println("<a href='Logout' >Logout</a>");

        }
    }

    }
