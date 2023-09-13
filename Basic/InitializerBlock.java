class Employee{
    static int connection;
    {   
        System.out.println("Enter Initializer Block");
        connection = 10;
        System.out.println("Exit Initializer Block");
    }
    Employee(){
        System.out.println("Connection is : " + connection);
    }
    void method(){
        System.out.println("Connection is : " + connection);
        connection = 20;
        System.out.println("After change connection is : " + connection);
    }
}

public class InitializerBlock {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.method();
    }
}

/*
Scenario 1: Employee Database
In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.

 */