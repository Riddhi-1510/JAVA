import java.util.*;
class Parent{
    protected int a;
    Parent(){
        a = 0;
    }
    void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = scan.nextInt();
    }
    void display(){
        System.out.println("A is : " + a);
    }
}
class Child_1 extends Parent{
    private int b;
    Child_1(){
        a = 0;
        b = 0;
    }
    void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = scan.nextInt();
        System.out.println("Enter b : ");
        b = scan.nextInt();
    }
    void display(){
        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
    }
}

class Child_2 extends Parent{
   private int c;
    Child_2(){
        a = 0;
        c = 0;
    }
    void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = scan.nextInt();
        System.out.println("Enter c : ");
        c = scan.nextInt();

    }
    void display(){
        System.out.println("A is : " + a);
        System.out.println("B is : " + c);
    }
}

public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Child_1 obj_1 = new Child_1();
        Child_2 obj_2 = new Child_2();
        obj_1.scan();
        obj_1.display();

        obj_2.scan();
        obj_2.display();
    }
}
