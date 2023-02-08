package assignment7;
import java.util.*;
class Login{
    private int id;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
class Account{
    private int accountnumber;
    private String nameofaccountant;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getNameofaccountant() {
        return nameofaccountant;
    }

    public void setNameofaccountant(String nameofaccountant) {
        this.nameofaccountant = nameofaccountant;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountnumber=" + accountnumber +
                ", nameofaccountant='" + nameofaccountant + '\'' +
                '}';
    }
}

class Loan{
    private int loanid;
    private int loanamount;
    private int loantenure;

    public int getLoanid() {
        return loanid;
    }

    public void setLoanid(int loanid) {
        this.loanid = loanid;
    }

    public int getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(int loanamount) {
        this.loanamount = loanamount;
    }

    public int getLoantenure() {
        return loantenure;
    }

    public void setLoantenure(int loantenure) {
        this.loantenure = loantenure;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanid=" + loanid +
                ", loanamount=" + loanamount +
                ", loantenure=" + loantenure +
                '}';
    }
}
public class BankManagement {
    public static void main(String[] args) {
Account account=new Account();
Loan loan=new Loan();
Login login=new Login();
account.setAccountnumber(3451101);
account.setNameofaccountant("Raman");
login.setId(101);
login.setPassword("ask09");
loan.setLoanid(101);
loan.setLoanamount(1000000);
loan.setLoantenure(7);
System.out.println(loan);
        System.out.println(account);
        System.out.println(login);
    }
}
