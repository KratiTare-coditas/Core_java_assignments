package BankAccountManagementSystem;
import java.util.*;
import java.util.Scanner;

public class Operations {
    Scanner sc = new Scanner(System.in);
    ArrayList<Bank> list = new ArrayList<Bank>();
    double balance=5000;

    public void addaccount() {

        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter phn number");
        long phoneno = sc.nextLong();
        System.out.println("Enter emailid");
        String email = sc.next();

        long accountno;
        while (true) {
            long leftLimit = 100000000000L;
            long rightLimit = 999999999999L;
            accountno = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
            boolean exist = false;
            for (Bank list1 : list) {

                if (list1.accountno == accountno) {
                    exist = true;
                }
            }
            if (!exist) {
                break;
            }
        }
        System.out.println("Your account number is::" + accountno);
        System.out.println("Enter account type");
        String accounttype = sc.next();
        String companyname="null";
        if (accounttype.equals("current") ){
            System.out.println("Enter the name of your company::");
           sc.nextLine();
            companyname = sc.nextLine();
        Bank b1 = new Bank(name, address, phoneno, email, accounttype, accountno,balance,companyname);
        list.add(b1);


        }

    }

    public void deposit() {

        //double balance = 5000;
        System.out.println("Enter the account number::");
        long accountnum = sc.nextLong();
        for (Bank list1 : list) {
            if (list1.accountno == accountnum) {
                System.out.println("Enter deposit amount");
                int deposit = sc.nextInt();
                list1.balance+=deposit;
                System.out.println("Your balance now is::" + list1.balance);
            } else {
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {
                    e.getMessage();
                }
            }
        }
    }

    public void withdraw()
    {
        //int amount;
        System.out.println("Enter amount to withdraw");
        int amount=sc.nextInt();
        System.out.println("Enter the account number to withdraw amount");
        long accountnumber=sc.nextLong();
        for(Bank list1:list)
        {
            if(list1.accountno==accountnumber)
            {
                balance=balance-amount;
            }
            else
            {
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {
                    e.getMessage();
                }
            }
        }
        if(balance<0)
        {
            try {
                throw new InsufficientBalanceException();
            } catch (InsufficientBalanceException e) {
                e.getMessage();
            }
        }
        System.out.println("Amount after withdrawal is::"+balance);
    }

    public void display()
    {
    for(Bank list1:list)
    {
      // list.add(new Bank(balance))
        System.out.println(list);
    }

    }

}
