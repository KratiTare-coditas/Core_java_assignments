package Assignment17;
import java.util.HashSet;
public class Question5 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(25);
        set.add(8);
        set.add(11);

        System.out.println("Hash Set Contains :" + set);
        int arr[] = new int[set.size()];

        int i=0;
        for(int ele:set){
            arr[i++] = ele;
        }
        System.out.println("Array elemnts are:");
        for (int n : arr)
            System.out.println(n);
    }
}
/*
output
Hash Set Contains :[1, 8, 25, 11]
Array elemnts are::
1
8
25
11

Process finished with exit code 0
*/

