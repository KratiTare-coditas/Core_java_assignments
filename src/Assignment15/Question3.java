package Assignment15;
 class Demo implements  Runnable{
    public void run()
    {
        System.out.println("This is run method");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        Thread th1=new Thread(d1);
        Thread th2=new Thread(d2);
        Thread th3=new Thread(d3);
         th1.start();
        System.out.println(th1.getName());
        System.out.println(th1.getStackTrace());
        System.out.println(th1.getThreadGroup());
        System.out.println(th1.isAlive());
        System.out.println(th1.getState());
       // System.out.println(th1.join(2));
    }
}
