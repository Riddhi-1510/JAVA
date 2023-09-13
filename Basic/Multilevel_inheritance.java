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
class Child extends Parent{
    protected int b;
    Child(){
        b = 0;
        a = 0;
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
class GrandChild extends Child{
    private int c;
    GrandChild(){
        b = 0;
        a = 0;
        c = 0;
    }
    void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = scan.nextInt();
        System.out.println("Enter b : ");
        b = scan.nextInt();
        System.out.println("Enter c : ");
        c = scan.nextInt();
    }
    void display(){
        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
        System.out.println("C is : " + c);
    }

}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        Parent o = new Parent();
        o.scan();
        o.display();
        Child ob = new Child();
        ob.scan();
        ob.display();
        GrandChild obj = new GrandChild();
        obj.scan();
        obj.display();
    }
}
