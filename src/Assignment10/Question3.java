
//to check overriding by changing data type is possible or not
//conclusion:NO,it is not possible
package Assignment10;
class ShapeNew
{
    void Calculatearea(int length,int breadth)
    {
        System.out.println("Parent method Shape is called");
    }
}
class RectangleNew extends ShapeNew {
    void Calculatearea(int  length,int breadth)
    {
        int area=length*breadth;
        //return area;
    }
}
public class Question3 {
    public static void main(String[] args) {
        ShapeNew shape=new ShapeNew();
        RectangleNew rectanglenew=new RectangleNew();

    }
}
