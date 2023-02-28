package Assignment15;
class Newdemo extends Thread{
    public void run()
    {
        System.out.println("This is run method");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Newdemo d=new Newdemo();
        d.run();
    }
}
