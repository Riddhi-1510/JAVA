import java.util.*;

class Shape{
    protected int Area;
    Shape(){
        Area = 0;
    }
}
class Circle extends Shape{
//pi*r*r
    int r;
    Circle(int r){
        this.r  = r;
    }
    void area(){
        System.out.println("Area of Circle is : " + (3.14*r*r));
    }

}
class Rectangle extends Shape{
//a*b
    int a,b;
    Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }
    void area(){
        System.out.println("Area of Rectangle is : " + (a*b));
    }
}
class Triangle extends Shape{
//1/2*a*b
    float base,height;
    Triangle(float base,float height){
        this.base = base;
        this.height = height;
    }
    void area(){
        System.out.println("Area of Triangle is : " + (0.5*height*base));
    }
}
public class q_i4 {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(3, 2);
        Triangle t = new Triangle(3, 2);
        c.area();
        r.area();
        t.area();
    }
}


/*
Scenario 4: Shape Hierarchy
Develop a shape hierarchy with a base class called "Shape" and derived classes like "Circle," "Rectangle," and "Triangle." The base class can define common attributes like color and area calculation methods, while the derived classes can implement shape-specific behavior.

 */