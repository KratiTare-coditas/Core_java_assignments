package Assignment23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivityjdbc {
    static Connection con;
    static Connection createconnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practisekt","root","Jaishreeram@05");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

}
