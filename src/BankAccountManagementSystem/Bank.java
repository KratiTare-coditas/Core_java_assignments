package BankAccountManagementSystem;

public class Bank {

    String name;
    String address;
    long phoneno;
    String emailid;
    String accounttype;
    long accountno;
    double balance;
  String companyname;

    public Bank(String name, String address, long phoneno, String emailid, String accounttype, long accountno, double balance, String companyname) {
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.emailid = emailid;
        this.accounttype = accounttype;
        this.accountno = accountno;
        this.balance = balance;
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneno=" + phoneno +
                ", emailid='" + emailid + '\'' +
                ", accounttype='" + accounttype + '\'' +
                ", accountno=" + accountno +'\'' +
                ", balance=" + balance +", companyname=" + companyname +
                '}';

    //@Override

    }

   // @Override

}
