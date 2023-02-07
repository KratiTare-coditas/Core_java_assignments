package assignment6;

class Temperature{
    public void displayData()
    {
        int temperature=5;
        switch(temperature)
        {
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("high");
                break;
            default:
                System.out.println("abnormal");
        }
    }
}



public class Question3 {
    public static void main(String[] args) {
        Temperature temperature= new Temperature();
        temperature.displayData();
    }
}
