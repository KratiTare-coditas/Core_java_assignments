package BankAccountManagementSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean flag=true;
        Operations o1=new Operations();
        while(true)
        {
            System.out.println("0 to exit|| 1to add bank account|| 2 for deposit||3 to withdraw||4 to display all account details");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 0:
                    flag=false;
                    System.exit(0);
                    break;
                case 1:
                    //add bank account

                    o1.addaccount();
                    break;
                case 2:

                    o1.deposit();
                    break;
                case 3:
                    o1.withdraw();
                    break;
                case 4:

                    o1.display();
                    break;
                default:
                    break;
            }
        }
    }
}
