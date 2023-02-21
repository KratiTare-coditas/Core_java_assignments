package Assignment12;
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String string1 = sc.nextLine();
        string1 = string1.toLowerCase();
        int vowelcount = 0, conscount = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == 'a' || string1.charAt(i) == 'e' || string1.charAt(i) == 'i' || string1.charAt(i) == 'o' || string1.charAt(i) == 'u') {
                vowelcount++;
            }
            else if (string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z')
                {
                    conscount++;
                }

            }
        System.out.println("Count of vowel is::" + vowelcount);
        System.out.println("Count of consonant is::" + conscount);

        }
    }
/*
Enter a string: My name is Krati
Count of vowel is::5
Count of consonant is::8 */