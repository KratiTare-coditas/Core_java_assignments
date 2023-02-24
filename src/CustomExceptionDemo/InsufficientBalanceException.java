package Fifth_week.CustomExceptionDemo;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException()
    {
        System.out.println("Balance is insufficient");
    }
    InsufficientBalanceException(String s)
    {
        System.out.println("your balance was insufficient"+s);
    }


}
