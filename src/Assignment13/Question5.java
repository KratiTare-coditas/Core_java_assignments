package Assignment13;

public class Question5 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int sum=0;
        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

//  Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//	at Assignment13.Question5.main(Question5.java:9)

//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10

