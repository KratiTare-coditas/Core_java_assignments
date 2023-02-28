package Assignment15;
class Demothread extends Thread{
    public void run()
    {
        System.out.println("This is run method");
    }
}
public class Question1 {
    public static void main(String[] args) {
   Demothread d=new Demothread();
   d.start();
  // d.start();
    }
}
/*Output
No we cannot restart any thread,It will throw an exception.

"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=59995:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\coditas\IdeaProjects\Assignments\out\production\Assignments Assignment15.Question1
This is run method
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:1534)
	at Assignment15.Question1.main(Question1.java:12)

Process finished with exit code 1
 */