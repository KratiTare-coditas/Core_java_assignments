package Fifth_week.CustomExceptionDemo;

public class WithdrawAndDeposit {
    public void withdraw(int amount,int balance)
    {
        try {
            if (amount >balance) {
                throw new InvalidAmountException("Inavlid amount details");
            }
        }
        catch(InvalidAmountException e)
        {
          //  e.printStackTrace();
        }
    }
    public void deposit(int amount)
    {
        try{
            if(amount==0||amount<0)
            {
                throw new InsufficientBalanceException("Balanace is insuffient");
            }

        }
        catch(InsufficientBalanceException e)
        {
           // e.printStackTrace();
        }
    }


}
