
package assignment7;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        int[] arr = {5,6, 1, 3, 4, 9};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                System.out.println("Duplicate element is : " + arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        System.out.println("after duplicates is remove arr will be");
        for (Integer a : list) {
            System.out.println(a);
        }
    }
}

