package assignment6;
import java.util.Date;
class Gettodaydate{
    public void displayData()
    {
        Date d=new Date();
        int todaydate= d.getDate();
        for(int i=1;i<=30;i++){
            if(todaydate+1==i)
                break;
            System.out.print(i+" ");
        }
        System.out.println();


    }
}


public class Question7c {
    public static void main(String[] args) {
Gettodaydate gettodaydate=new Gettodaydate();
gettodaydate.displayData();
    }
}
