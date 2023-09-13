import java.util.*;
class Staff{
    String name;
    int salary;
}
class Professor extends Staff{
    String role;
    Professor(String name,int salary){
        this.name = name;
        this.salary = salary;
        this.role = "Professor";
    }
    void printData(){
        System.out.println("Name is : " +  name);
        System.out.println("Salary is : " + salary);
        System.out.println("Role is : "+role);
    }
}
class AdminStaff extends Staff{
    String role;
    AdminStaff(String name,int salary){
        this.name = name;
        this.salary = salary;
        this.role = "AdminStaff";
    }
    void printData(){
        System.out.println("Name is : " +  name);
        System.out.println("Salary is : " + salary);
        System.out.println("Role is : "+role);
    }
}
class TechnicalStaff extends Staff{
    String role;
    TechnicalStaff(String name,int salary){
        this.name = name;
        this.salary = salary;
        this.role = "TechnicalStaff";
    }
    void printData(){
        System.out.println("Name is : " +  name);
        System.out.println("Salary is : " + salary);
        System.out.println("Role is : "+role);
    }
}

public class q_i7 {
    public static void main(String[] args) {
        Professor p = new Professor("Anil Roy", 10000000);

        AdminStaff a = new AdminStaff("Pankaj patel", 50000);

        TechnicalStaff t = new TechnicalStaff("Ramu Rajni", 10000);
        p.printData();
        a.printData();
        t.printData();
    }
}
/*
Scenario 7: University Staff Hierarchy
Develop a university staff hierarchy with a base class called "Staff" and derived classes like "Professor," "AdminStaff," and "TechnicalStaff." The base class can include attributes like name and salary, while the derived classes can have additional attributes based on their roles.
 */
