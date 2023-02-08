
package assignment7;
import java.sql.SQLOutput;
import java.util.Arrays;
public class Question1 {
    public static void main(String[] args) {
        int array1[] = {134, 28, 10, 21, 20};
        int array2[]={100, 98, 80, 1, 20};
        System.out.println("=========SORTING OF ARRAY========");
        Arrays.sort(array1);
        //use of for each loop
        for(int i:array1) {
            System.out.println(i+" ");
        }
        System.out.println("==========BINARY SEARCH===================");
        int intKey = 134;

        System.out.println(
                intKey + " found at index = " + Arrays.binarySearch(array1, 1, 5, intKey));
        System.out.println("==============EQUALS METHOD==========");
        System.out.println("Integer Arrays on comparison: "
                + Arrays.equals(array1,array2));

    }
}
