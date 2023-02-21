package Assignment12;
import java.util.*;
import java.util.regex.Pattern;



public class Question6 {
    public static void main(String[] args) {
        String string1 = "My name is Krati";

        char[] array = new char[string1.length()];
        for (int i = 0; i < string1.length(); i++) {
            array[i] = string1.charAt(i);
        }
        for (char c : array) {
            System.out.println(c);
        }
    }
}

/* Output:
M
y

n
a
m
e

i
s

K
r
a
t
i

 */