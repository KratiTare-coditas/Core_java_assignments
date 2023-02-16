//question 1 and question2
package Assignment10;
 class Shape{
    void Calculatearea(int length,int breadth)
{
   System.out.println("Parent method Shape is called");
}
}
class Circle extends Shape{
void Calculatearea(int radius)
{
    double area=3.14*radius*radius;
    System.out.println("Area of circle is::"+area);
}
}
class Triangle extends Shape{
    public double Calculatearea(float breadth, float height)
    {
        double area=(breadth*height)/2;
       return area;
    }


}
class Rectangle extends Shape{
    void Calculatearea(int length,int breadth)
    {
        int area=length*breadth;

        System.out.println("Area of rectangle is::"+area);
    }

}
public class Question1 {
    public static void main(String[] args) {
      Triangle triangle=new Triangle();

        System.out.println("Area of triangle::"+triangle.Calculatearea(10.2f,2));
     Circle circle=new Circle();
     circle.Calculatearea(2);
      Rectangle rectangle=new Rectangle();
      rectangle.Calculatearea(10,20);
    }
}
