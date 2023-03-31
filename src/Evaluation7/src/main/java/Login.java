import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.CertSelector;
import java.sql.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int count;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        ServletContext context= req.getServletContext();
        HttpSession session= req.getSession();
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        try {
            Class.forName(context.getInitParameter("driver"));
            con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));


            ps = con.prepareStatement("select * from registration");
            rs = ps.executeQuery();
            String name = " ";

            while (rs.next()) {
                String uname = rs.getString(2);
                String pwd = rs.getString(3);
                if (username.equals(uname) && password.equals(pwd)) {
                    out.println("welcome" + uname);
                    name = rs.getString(1);
                    count++;
                    ps = con.prepareStatement("insert into login(username,password)values(?,?)");
                    ps.setString(1, uname);
                    ps.setString(2, pwd);
                    ps.executeUpdate();

                }
                if (count == 1) {
                    session.setAttribute("username", name);
                    //resp.sendRedirect("Welcome");
                    RequestDispatcher rd = req.getRequestDispatcher("Welcome");
                    rd.forward(req,resp);
                } else {

                    out.println("Sorry invalid entry");
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
                    requestDispatcher.include(req, resp);


                }
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
