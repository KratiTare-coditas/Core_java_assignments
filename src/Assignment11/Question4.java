package Assignment11;

class Shape{
    int area(int length,int breadth){
        return length*breadth;
    }
}
class Cuboid extends Shape{
    int height;
    int area;

    public Cuboid(int length,int breadth,int height) {
        this.height = height;
        this.area= area(length,breadth);
    }

    @Override
    public String toString() {
        return "Cuboids{" +
                "height=" + height +
                ", area=" + area +
                '}';
    }

}
public class Question4{
    public static void main(String args[]){
        Cuboid cuboid = new Cuboid(10,5,5);
        System.out.println(cuboid);

    }
}