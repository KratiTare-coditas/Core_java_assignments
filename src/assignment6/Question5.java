package assignment6;
import java.util.Scanner;
class Greatestoftwo{
    public void displayResult()
    {

        Scanner s = new Scanner(System.in);
        int number1,number2;
        number1 = s.nextInt();

        //Scanner s = new Scanner(System.in);
        number2 = s.nextInt();

       if(number1>number2) {
           System.out.println(number1+"is greater");
       }
       else {
           System.out.println( number2+" is greater");
       }
    }
}

public class Question5 {
    public static void main(String[] args) {
        Greatestoftwo greatestoftwo=new Greatestoftwo();
        greatestoftwo.displayResult();
    }
}
