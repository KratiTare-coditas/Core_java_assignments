package assignment7;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {

        Integer array[] = {89, 99, 71, 4, 60};
        System.out.println("=====ASCENDING ORDER=====");
        Arrays.sort(array);
        for(int i:array) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=====DESCENDING ORDER====");
       Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }
}
