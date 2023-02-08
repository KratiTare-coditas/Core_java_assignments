package Regularclass;

class Area{
    private int length;
    private int breadth;

    private int area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        area=length*breadth;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", area=" + area +
                '}';
    }
}




public class Rectangle {
    public static void main(String[] args) {
        Area area= new Area();
        area.setLength(12);
        area.setBreadth(2);
        System.out.println("The area of rectangle is::"+area.getArea());
        System.out.println(area);
    }
}
