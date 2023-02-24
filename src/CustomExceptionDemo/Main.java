package Fifth_week.CustomExceptionDemo;

public class Main {
    public static void main(String[] args) {
        WithdrawAndDeposit withdrawAndDeposit=new WithdrawAndDeposit();
        withdrawAndDeposit.deposit(-100);
        withdrawAndDeposit.withdraw(500,400);
    }
}
