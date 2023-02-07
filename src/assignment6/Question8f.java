package assignment6;

public class Question8f {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);

            }
            ch--;
            for(int k=2;k<=i;k++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}










