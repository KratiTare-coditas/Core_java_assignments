package Assignment23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class StudentMain {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        Studentoperations op=new Studentoperations();
        while(flag)
        {
            System.out.println("0 TO EXIT");
            System.out.println("1.ALTER STUDENT ADD GENDER COLUMN");
            System.out.println("2. FETCH STUDENT IN THIRD YEAR AND PERCENTAGE>70");
            System.out.println("3.FETCH STUDENT WHOSE ID IS BETWEEN 1-10");
            System.out.println("4. PERFROM OPERATIONS 4.1 4.2 4.3");
            System.out.println("Enter choice::");
            int ch=Integer.parseInt(sc.readLine());
            switch(ch)
            {
                case 0:
                    flag=false;
                    break;
                case 1:
                    op.Query1();
                    break;
                case 2:
                    op.Query2();
                    break;
                case 3:
                    op.Query3();
                    break;
                case 4:
                    op.Query4();
                    break;
                default:
                    System.out.println("INVALID INPUT!!!!");
            }
        }
    }
}
/*
OUTPUT:

0.TO EXIT
1.ALTER STUDENT ADD GENDER COLUMN
2. FETCH STUDENT IN THIRD YEAR AND PERCENTAGE>70
3.FETCH STUDENT WHOSE ID IS BETWEEN 1-10
4. PERFROM OPERATIONS 4.1 4.2 4.3
Enter choice::
1
ALTERATION DONE!!
0.TO EXIT
1.ALTER STUDENT ADD GENDER COLUMN
2. FETCH STUDENT IN THIRD YEAR AND PERCENTAGE>70
3.FETCH STUDENT WHOSE ID IS BETWEEN 1-10
4. PERFROM OPERATIONS 4.1 4.2 4.3
Enter choice::
2
ID::4
NAME::Mr. Yash
YEAR::third
PERCENTAGE::75
CITY::Agra
GENDER::M
=====================
0.TO EXIT
1.ALTER STUDENT ADD GENDER COLUMN
2. FETCH STUDENT IN THIRD YEAR AND PERCENTAGE>70
3.FETCH STUDENT WHOSE ID IS BETWEEN 1-10
4. PERFROM OPERATIONS 4.1 4.2 4.3
Enter choice::
3
ID::1
NAME::Ms. Krati
YEAR::first
PERCENTAGE::99
CITY::Indore
GENDER::F
=============================
ID::2
NAME::Ms. Shreya
YEAR::second
PERCENTAGE::95
CITY::Dewas
GENDER::F
=============================
ID::3
NAME::Mr. Aryaman
YEAR::last
PERCENTAGE::89
CITY::Bhopal
GENDER::M
=============================
ID::4
NAME::Mr. Yash
YEAR::third
PERCENTAGE::75
CITY::Agra
GENDER::M
=============================
0.TO EXIT
1.ALTER STUDENT ADD GENDER COLUMN
2. FETCH STUDENT IN THIRD YEAR AND PERCENTAGE>70
3.FETCH STUDENT WHOSE ID IS BETWEEN 1-10
4. PERFROM OPERATIONS 4.1 4.2 4.3
Enter choice::
4
 Enter 1 to add 3 records
Enter 2 to update
Enter 3 to remove students in last year
Enter choice
3
DELETION DONE!!
Enter 0 to exit
Enter 1 to add 3 records
Enter 2 to update
Enter 3 to remove students in last year
Enter choice
0

0.TO EXIT
1.ALTER STUDENT ADD GENDER COLUMN
2. FETCH STUDENT IN THIRD YEAR AND PERCENTAGE>70
3.FETCH STUDENT WHOSE ID IS BETWEEN 1-10
4. PERFROM OPERATIONS 4.1 4.2 4.3
Enter choice::

 */