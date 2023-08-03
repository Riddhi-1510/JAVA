class Shape{
    static int count = 0;
    String name;
    Shape(String name){
        this.name = name;
        count++;
    }
    void display(){
        System.out.println("Shape Name is : " + name);
        System.out.println("Count is : " + count);
    }
};

public class StaticE5 {
    public static void main(String[] args) {
        Shape obj1 = new Shape("Square");
        obj1.display();
        Shape obj2 = new Shape("Circle");
        obj2.display();
        
    }
}

/*
 * Create a Shape class which has a static variable count and a non-static
 * variable name. Create a constructor which increments the count whenever an 
 * object is created and sets the name to the parameter passed to the constructor.
 * Create a method to display the name and count. Create a class called Main
 * which creates two objects of the Shape class and display their names and count.
 */