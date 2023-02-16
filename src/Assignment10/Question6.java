package Assignment10;

interface ShapeDemo{
    String color="Red";
    void getArea();
}
class RectangleDemo  implements ShapeDemo{
    int length,breadth;
    RectangleDemo(){
        length=0;
        breadth=0;
    }
    RectangleDemo(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void getArea() {
        System.out.println("Area is : "+length*breadth);
    }

}
class TriangleDemo implements ShapeDemo{
    int base,height;
    TriangleDemo(){
        base=0;
        height=0;
    }
    TriangleDemo(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void getArea() {
        System.out.println("Area is : "+height*base/2);
    }
}
public class Question6 {
    public static void main(String args[]){
    RectangleDemo rectangle=new RectangleDemo(10,20);
    rectangle.getArea();
    TriangleDemo triangle=new TriangleDemo(30,2);
    triangle.getArea();
    }
}







