package assignment7;
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        int [][] array1 = {{2,2},{1,2,3},{2,3,5,9}};
        int [][] array2 = {{1,2},{3,4,5},{6,7,8,9}};
        int addition=0;
        for(int i = 0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                addition = array1[i][j] + array2[i][j];
                System.out.println(" "+ addition);
            }
        }
    }
}







