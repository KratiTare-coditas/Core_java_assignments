package assignment6;

class Switchtoifconvert{

    public void displayData(){
        int x=10,m=2;
        if(m==0)
        {
            x=x+2;
            System.out.println("X="+x);
        }
        else if(m==1)
        {
            x=x+4;
            System.out.println("X="+x);
        }
        else if(m==2)
        {
            x=x+6;
            System.out.println("X="+x);
        }


    }
}
public class Question4 {
    public static void main(String[] args) {
Switchtoifconvert switchtoifconvert= new Switchtoifconvert();
switchtoifconvert.displayData();
    }
}
