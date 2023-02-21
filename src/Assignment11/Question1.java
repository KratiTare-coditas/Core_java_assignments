package Assignment11;

class Animal{
    private String name;
    public void display(){
        System.out.println("This is the parent class");
    }
    Animal()
    {
        System.out.println("This is no arg conmstructor of base class");
    }
    Animal(String name)
    {
        System.out.println("Parametrised constructor of base class");
    }
}
class Dog extends Animal{

public void display()
{
    System.out.println("This is child method");
}
Dog()
{
    System.out.println("No arg constructor of child class");
}
Dog(String name){
    super(name);
    System.out.println("Parametrised constrctor of child class");
}
}
public class Question1 {
    public static void main(String[] args) {
    Dog dog=new Dog("Tommy");
    }
}
