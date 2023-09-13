import java.util.Scanner;
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
    private int b;
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
public class single_inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.scan();
        obj.display();
    }
}
