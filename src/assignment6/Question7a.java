package assignment6;


class Daysofweek{

    public void displayData(){
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i< days.length;i++)
        {
            System.out.println(days[i]);
        }
    }
}



public class Question7a {
    public static void main(String[] args) {
Daysofweek daysofweek = new Daysofweek();
daysofweek.displayData();
    }
}
