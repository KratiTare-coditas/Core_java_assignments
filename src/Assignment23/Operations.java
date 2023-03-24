package Assignment23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operations {
    Connection con=Connectivityjdbc.createconnection();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;

    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

    public void insertemp() throws IOException, SQLException {
        System.out.println("Enter number of record");
        int n = Integer.parseInt(sc.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter id");
            int empid = Integer.parseInt(sc.readLine());
            System.out.println("Enter name");
            String empname = sc.readLine();
            System.out.println("Enter designation");
            String designation = sc.readLine();
            System.out.println("Enter doj");
            String doj = sc.readLine();
            System.out.println("exp");
            int exp = Integer.parseInt(sc.readLine());
            System.out.println("salary");
            int salary = Integer.parseInt(sc.readLine());
            System.out.println("status");
            String status = sc.readLine();
            ps = con.prepareStatement("insert into employee(empid,empname,designation,doj,exp,salary,status)values(?,?,?,?,?,?,?)");
            ps.setInt(1, empid);
            ps.setString(2, empname);
            ps.setString(3, designation);
            ps.setString(4, doj);
            ps.setInt(5, exp);
            ps.setInt(6, salary);
            ps.setString(7, status);
            ps.executeUpdate();

        }
        System.out.println("EMPLOYEE DETAILS ADDED!");
    }
public void displayall() throws SQLException {
    //String sql="select * from employee";
    st=con.createStatement();
    rs=st.executeQuery("select * from employee");
    while(rs.next())
    {
        System.out.println("EMPID::"+rs.getInt(1));
        System.out.println("EMPNAME::"+rs.getString(2));
        System.out.println("DESIGNATION"+rs.getString(3));
        System.out.println("DATE OF JOINING:"+rs.getDate(4));
        System.out.println("EXPERIENCE::"+rs.getInt(5));
        System.out.println("SALARY::"+rs.getInt(6));
        System.out.println("STATUS::"+rs.getString(7));
        System.out.println("CITY::"+rs.getString(8));
        System.out.println("======================");
    }


}
public void alteremp() throws SQLException {

    ps=con.prepareStatement("alter table employee add column city varchar(20) DEFAULT 'PUNE' ");
    ps.executeUpdate();

    System.out.println("ALTERATION DONE!!");

}
public void fetchemp() throws SQLException {
    ps=con.prepareStatement("select * from employee where city='PUNE' and salary>20000");
    rs=ps.executeQuery();
    while(rs.next())
    {
        System.out.println("EMPID::"+rs.getInt(1));
        System.out.println("EMPNAME::"+rs.getString(2));
        System.out.println("DESIGNATION"+rs.getString(3));
        System.out.println("DATE OF JOINING:"+rs.getDate(4));
        System.out.println("EXPERIENCE::"+rs.getInt(5));
        System.out.println("SALARY::"+rs.getInt(6));
        System.out.println("STATUS::"+rs.getString(7));
        System.out.println("CITY::"+rs.getString(8));
        System.out.println("======================");
    }
    System.out.println("QUERY EXECUTED");

}
public void salaryupdate() throws SQLException {
    ps=con.prepareStatement("update employee set salary=salary+1000;");
    ps.executeUpdate();
    System.out.println("SALARY UPDATED!!");
}
}
