package BankAccountManagementSystem;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException() {
        System.out.println("Your balance is not suufficient");
    }
}
