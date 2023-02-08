package assignment7;
import java.util.Scanner;
public class Question6 {
    public static void main(String args[]) {
        int[] arr = {12, 56, 8, 19, 67};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth position");
        int n = sc.nextInt();
        if (n <= arr.length) {
            int element= arr[n - 1];
            System.out.println("Element at nth position is::"+element);
        } else {
            System.out.println("Enter any position from " + arr.length);
        }
    }
}