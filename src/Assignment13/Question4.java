package Assignment13;

class Animal
{
   public void show()
    {
        System.out.println("This is parent class");
    }
        }
class Dog extends Animal{
    public void show()
    {
        System.out.println("This is dog class");
    }
}
class Cat extends Animal{
    public void show() {
        System.out.println("This is cat class");
    }
}
public class Question4{
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();
        try {
            Dog dog1 = (Dog) animal;
        }
        catch(ClassCastException e)
        {
            System.out.println(e);
        }


    }
}
//output: "C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=53128:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\coditas\IdeaProjects\Assignments\out\production\Assignments Assignment13.Question4
//Exception in thread "main" java.lang.ClassCastException: class Assignment13.Animal cannot be cast to class Assignment13.Dog (Assignment13.Animal and Assignment13.Dog are in unnamed module of loader 'app')
//	at Assignment13.Question4.main(Question4.java:26)//

//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10