class Shap{
    void draw(){
        System.out.println("Main method");
    }
}
class Circle extends Shap{
     @Override
    void draw(){
        System.out.println("Draw -> Circle");
    }
}
class Rectangle extends Shap{
     @Override
    void draw(){
        System.out.println("Draw -> Rectangle");
    }
}
class Triangle extends Shap{
     @Override
    void draw(){
        System.out.println("Draw -> Triangle");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        Triangle t = new Triangle();
        t.draw();
    }
}

/*
Scenario 1: Shape Drawing Application
In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.

 */