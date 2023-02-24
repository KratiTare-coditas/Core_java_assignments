package Fifth_week.CustomExceptionDemo;

public class InvalidAmountException extends Exception{
    InvalidAmountException()
    {
        System.out.println("Amount is invalid");
    }
    InvalidAmountException(String s)
    {
        System.out.println("Your amount is invalid"+s);
    }
}
