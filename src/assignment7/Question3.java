package assignment7;
import java.util.Arrays;

public class Question3 {

        public static void main(String[] args) {

            int array[] = {77,12,38,50,6};
            System.out.println(Arrays.toString(array));

            System.out.println("****************** Copy Of****************************");
            System.out.println("New Array "+Arrays.toString(Arrays.copyOf(array,5)));

        }
    }




