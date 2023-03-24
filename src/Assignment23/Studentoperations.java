package Assignment23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Studentoperations {

    Connection con=Connectivityjdbc.createconnection();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;

    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    //id,name,year,percentage,city
public void Query1() throws SQLException {
    ps=con.prepareStatement("alter table student3 add column Gender varchar(20);");
    ps.executeUpdate();
    System.out.println("ALTERATION DONE!!");
}
public void    Query2() throws SQLException {
    ps=con.prepareStatement("select * from student3 where year ='third' and percentage>70;");
    rs=ps.executeQuery();
    while(rs.next()){
        System.out.println("ID::"+rs.getInt(1));
        System.out.println("NAME::"+rs.getString(2));
        System.out.println("YEAR::"+rs.getString(3));
        System.out.println("PERCENTAGE::"+rs.getInt(4));
        System.out.println("CITY::"+rs.getString(5));
        System.out.println("GENDER::"+rs.getString(6));
        System.out.println("=====================");
    }
}
public void     Query3() throws SQLException {
    ps=con.prepareStatement("select * from student3 where sid between 1 and 10;");
    rs=ps.executeQuery();
    while(rs.next())
    {
        System.out.println("ID::"+rs.getInt(1));
        System.out.println("NAME::"+rs.getString(2));
        System.out.println("YEAR::"+rs.getString(3));
        System.out.println("PERCENTAGE::"+rs.getInt(4));
        System.out.println("CITY::"+rs.getString(5));
        System.out.println("GENDER::"+rs.getString(6));
        System.out.println("=============================");
    }
}
public void Query4() throws IOException {
    boolean flag = true;
    while (flag) {
        System.out.println("Enter 0 to exit");
        System.out.println("Enter 1 to add 3 records");
        System.out.println("Enter 2 to update");
        System.out.println("Enter 3 to remove students in last year");
        System.out.println("Enter choice");
        int ch = Integer.parseInt(sc.readLine());
        switch (ch) {
            case 0:
                flag = false;
                break;
            case 1:
                //System.out.println();
                try {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter id");
                        int sid = Integer.parseInt(sc.readLine());
                        System.out.println("Enter name:");
                        String sname = sc.readLine();
                        System.out.println("Enter year");
                        String year = sc.readLine();
                        System.out.println("Enter percentage");
                        int percentage = Integer.parseInt(sc.readLine());
                        System.out.println("Enter city");
                        String city = sc.readLine();
                        System.out.println("Enter gender");
                        String gender = sc.readLine();
                        ps = con.prepareStatement("insert into student3 (sid,sname,year,percentage,city,gender)values(?,?,?,?,?,?)");
                        ps.setInt(1, sid);
                        ps.setString(2, sname);
                        ps.setString(3, year);
                        ps.setInt(4, percentage);
                        ps.setString(5, city);
                        ps.setString(6, gender);
                        System.out.println("Insertion done!");

                    }

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }


                break;
            case 2:
                try {

                    ps=con.prepareStatement("UPDATE student3 SET sname = CONCAT('Mr. ', sname) WHERE Gender = 'M';");
                ps.executeUpdate();
                    PreparedStatement ps1=con.prepareStatement("UPDATE student3 SET sname = CONCAT('Ms. ', sname) WHERE Gender = 'F';");
                    ps1.executeUpdate();

                    System.out.println("DONE!!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }


                break;
            case 3:
                try {
                    ps=con.prepareStatement("delete from student3 where year='third';");
                    ps.executeUpdate();
                    System.out.println("DELETION DONE!!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
}
