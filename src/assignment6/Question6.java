package assignment6;
import java.util.Scanner;


class CompareAge{
    public void getAge()
    {
        Scanner s = new Scanner(System.in);
        int age1,age2,age3;
        age1= s.nextInt();
        age2=s.nextInt();
        age3=s.nextInt();
        if(age1>age2 && age1>age3)
            System.out.println("Person with age "+age1+" is oldest");
        else if(age2>age1 && age2>age3)
            System.out.println("Person with age "+age2+" is oldest");
        else
            System.out.println("Person with age "+age3+" is oldest");
        if(age1<age2 && age1<age3)
            System.out.println("Person with age "+age1+" is youngest");
        else if(age2<age1 && age2<age3)
            System.out.println("Person with age "+age2+" is youngest");
        else
            System.out.println("Person with age "+age3+" is youngest");





    }
}
public class Question6 {
    public static void main(String[] args) {
 CompareAge compareAge=new CompareAge();
        compareAge.getAge();
    }
}
