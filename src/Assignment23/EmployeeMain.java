package Assignment23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class EmployeeMain {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        Operations op=new Operations();
        boolean flag=true;
        while(true)
        {
            System.out.println("0.TO EXIT");
            System.out.println("1.TO INSERT ");
            System.out.println("2.DISPLAY ALL");
            System.out.println("3.ALTER EMP ");
            System.out.println("4. FETCH EMP FROM PUNE AND SALARY>2000");
            System.out.println("5.UPDATE SALARY");
            System.out.println("Enter your choice::");
            int ch=Integer.parseInt(sc.readLine());
            switch(ch)
            {
                case 0:
                    flag=false;
                    break;
                case 1:
                    op.insertemp();
                    break;
                case 2:
op.displayall();
                    break;
                case 3:
                    op.alteremp();
                    break;
                case 4:
op.fetchemp();
break;
                case 5:
                    op.salaryupdate();
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }

    }
}
/*OUTPUT:
0.TO EXIT
1.TO INSERT
2.DISPLAY ALL
3.ALTER EMP
4. FETCH EMP FROM PUNE AND SALARY>2000
5.UPDATE SALARY
Enter your choice::
1
Enter number of record
1
Enter id
103
Enter name
Sanyukta
Enter designation
Cordinator
Enter doj
2020-09-08
exp
3
salary
35000
status
working
EMPLOYEE DETAILS ADDED!
1.TO INSERT
2.DISPLAY ALL
3.ALTER EMP
4. FETCH EMP FROM PUNE AND SALARY>2000
5.UPDATE SALARY
Enter your choice::
2
EMPID::101
EMPNAME::Aarti
DESIGNATIONjava trainer
DATE OF JOINING:2015-08-11
EXPERIENCE::8
SALARY::51000
STATUS::working
CITY::PUNE
======================
EMPID::102
EMPNAME::Aniruddha
DESIGNATIONManager
DATE OF JOINING:2018-09-08
EXPERIENCE::6
SALARY::53000
STATUS::working
CITY::PUNE
======================
EMPID::103
EMPNAME::Sanyukta
DESIGNATIONCordinator
DATE OF JOINING:2020-09-08
EXPERIENCE::3
SALARY::35000
STATUS::working
CITY::PUNE
======================
0.TO EXIT
1.TO INSERT
2.DISPLAY ALL
3.ALTER EMP
4. FETCH EMP FROM PUNE AND SALARY>2000
5.UPDATE SALARY
Enter your choice::
4
EMPID::101
EMPNAME::Aarti
DESIGNATIONjava trainer
DATE OF JOINING:2015-08-11
EXPERIENCE::8
SALARY::51000
STATUS::working
CITY::PUNE
======================
EMPID::102
EMPNAME::Aniruddha
DESIGNATIONManager
DATE OF JOINING:2018-09-08
EXPERIENCE::6
SALARY::53000
STATUS::working
CITY::PUNE
======================
EMPID::103
EMPNAME::Sanyukta
DESIGNATIONCordinator
DATE OF JOINING:2020-09-08
EXPERIENCE::3
SALARY::35000
STATUS::working
CITY::PUNE
======================
QUERY EXECUTED
0.TO EXIT
1.TO INSERT
2.DISPLAY ALL
3.ALTER EMP
4. FETCH EMP FROM PUNE AND SALARY>2000
5.UPDATE SALARY
Enter your choice::
5
SALARY UPDATED!!
0.TO EXIT
1.TO INSERT
2.DISPLAY ALL
3.ALTER EMP
4. FETCH EMP FROM PUNE AND SALARY>2000
5.UPDATE SALARY


 */