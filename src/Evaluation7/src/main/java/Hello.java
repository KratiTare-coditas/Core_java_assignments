import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context= request.getServletContext();
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		String firstname=request.getParameter("firstname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String city=request.getParameter("city");
		String phoneno=request.getParameter("phoneno");

	try {
			Class.forName(context.getInitParameter("driver"));
			con= DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
			ps=con.prepareStatement("insert into registration values(?,?,?,?,?)");
			ps.setString(1,firstname);
			ps.setString(2,username);
			ps.setString(3,password);
			ps.setString(4,city);
			ps.setString(5,phoneno);
			ps.executeUpdate();
			out.println("Registration successful!");
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("index.html");
		requestDispatcher.include(request,response);
		response.sendRedirect("login.html");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}



}
