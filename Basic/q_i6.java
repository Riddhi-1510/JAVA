import java.util.*;
class Electronics{
    String brand;
    int price;
}
class Television extends Electronics{
    String featurs;
    String functionalities;
    Television(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    void scanData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Extra Featurs of Television : ");
        featurs = scan.nextLine();
        System.out.println("Enter Extra Functionlities : ");
        functionalities = scan.nextLine();
    }
    void printData(){
        System.out.println("---Televison---");
        System.out.println("Brand is : " + brand);
        System.out.println("Price is : " + price);
        System.out.println("featurs : "+ featurs);
        System.out.println("Functionlities : " + functionalities);
    }
}
class Smartphone extends Electronics{
    String featurs;
    String functionalities;
    Smartphone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    void scanData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Extra Featurs of Television : ");
        featurs = scan.nextLine();
        System.out.println("Enter Extra Functionlities : ");
        functionalities = scan.nextLine();
    }
    void printData(){
        System.out.println("---SmartPhone---");
        System.out.println("Brand is : " + brand);
        System.out.println("Price is : " + price);
        System.out.println("featurs : "+ featurs);
        System.out.println("Functionlities : " + functionalities);
    }
}
class Laptop extends Electronics{
    String featurs;
    String functionalities;
    Laptop(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    void scanData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Extra Featurs of Television : ");
        featurs = scan.nextLine();
        System.out.println("Enter Extra Functionlities : ");
        functionalities = scan.nextLine();
    }
    void printData(){
        System.out.println("---Laptop---");
        System.out.println("Brand is : " + brand);
        System.out.println("Price is : " + price);
        System.out.println("featurs : "+ featurs);
        System.out.println("Functionlities : " + functionalities);
    }
}
public class q_i6 {
    public static void main(String[] args) {
            Television obj = new Television("Sony", 1000000);
            obj.scanData();
            obj.printData();

            Smartphone obj1 = new Smartphone("iPone12", 55000);
            obj1.scanData();
            obj1.printData();

            Laptop obj2 = new Laptop("hp", 70000);
            obj2.scanData();
            obj2.printData();
    }
}

/*
Scenario 6: Electronics Product Hierarchy
Design an electronics product hierarchy with a base class called "Product" and derived classes like "Television," "Smartphone," and "Laptop." The base class can contain attributes like brand and price, while the derived classes can have specific features and functionalities.
 */