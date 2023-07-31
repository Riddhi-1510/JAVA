class Circle{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("Area is : " + (3.14*radius*radius));
    }
};

public class task10 {
    public static void main(String[] args) {
        Circle obj = new Circle(11);
        obj.area();
    }
}

/*

Problem 4: Circle Geometry
Write a Java class "Circle" to represent a circle with private data members such as radius (double) and area (double). Implement a parameterized constructor to initialize the radius and calculate the area. Include a method to display the circle's area.

 */