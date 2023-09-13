import java.util.*;
class Employee {
    String name;
    int Eid;
}
class Manager extends Employee{
    String role;
    Manager(){
        role = "Manager";
    }
    void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        name = scan.next();
        System.out.println("Enter Eid : ");
        Eid = scan.nextInt();
    }
    void display(){
        System.out.println("name is : " + name);
        System.out.println("Eid is : " + Eid);
        System.out.println("His role is : " + role);
    }
}
class Enginner extends Employee{
    String role;
    Enginner(){
        role = "Enginner";
    }
     void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        name = scan.next();
        System.out.println("Enter Eid : ");
        Eid = scan.nextInt();
    }
    void display(){
        System.out.println("name is : " + name);
        System.out.println("Eid is : " + Eid);
        System.out.println("His role is : " + role);
    }
}
class Intern extends Employee{
     String role;
    Intern(){
        role = "Intern";
    }
     void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        name = scan.next();
        System.out.println("Enter Eid : ");
        Eid = scan.nextInt();
    }
    void display(){
        System.out.println("name is : " + name);
        System.out.println("Eid is : " + Eid);
        System.out.println("His role is : " + role);
    }
}
public class q_i2 {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        Enginner obj2 = new Enginner();
        Intern obj3 = new Intern();
        obj1.scan();
        obj1.display();
        obj2.scan();
        obj2.display();
        obj3.scan();
        obj3.display();
    }
}

/*
 Scenario 2: Employee Hierarchy
Create an employee hierarchy with a base class called "Employee" and derived classes like "Manager," "Engineer," and "Intern." The base class can contain attributes like name and employee ID, while the derived classes can have additional attributes specific to their roles.
 */