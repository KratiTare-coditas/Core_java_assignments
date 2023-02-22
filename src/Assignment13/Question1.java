package Assignment13;

public class Question1{
    public static void main(String[] args) {
        int number = 5;
        assert number == 10 : "number should be 10";
        System.out.println("end");
    }
}

/*
Assertions in Java are a way to ensure that certain conditions are met during runtime.
An assertion is a statement that checks a boolean expression and throws an AssertionError if the expression is false.
It is often used for debugging and testing purposes.
To use assertions in Java, you can use the assert keyword followed by a boolean expression.
 */
