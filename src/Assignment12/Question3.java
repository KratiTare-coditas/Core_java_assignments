package Assignment12;


import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        String string1 = "Coditas provides great learning environment";
        char str[] = string1.toCharArray();
        //Calculating length of the character array
        int len = str.length;
        //Calling removeDuplicates() method to remove duplicate characters
        removeDuplicate(str, len);
    }

    public  static void removeDuplicate(char str[], int length) {

        int index = 0;

        // Traversing character array
        for (int i = 0; i < length; i++)
        {

            // Check whether str[i] is present before or not
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }

}
//output:Coditas prveglnm