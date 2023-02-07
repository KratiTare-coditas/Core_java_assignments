package assignment6;

public class Question8d {

    public static void main(String[] args) {
              for(int i=1;i<=11;i++)
                {
                    char k='A';
                    for(int j=1;j<=7;j++){
                        if(i<7)
                        {
                            if(j<=i){
                                System.out.print(k);
                                k++;}
                        }
                        else if(j<=12-i){
                            System.out.print(k);
                            k++;}
}
                    System.out.println(" ");
                }
            }
        }

