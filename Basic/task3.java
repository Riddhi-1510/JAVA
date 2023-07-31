class Employee{
    
    String name;
    int employeeId;
    String designation;
    int salary;

    Employee(){
        name = "Unknown";
        designation = "Unknown";
        employeeId = 0;
        salary = 0;
    }
    void printData(){
        System.out.println("name is : " + name);
        System.out.println("designation is : " + designation);
        System.out.println("Employee id is : " + employeeId);
        System.out.println("salary is : " + salary);
    }
}

public class task3 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.printData();
    } 
}

/*
2. Employee Database:
You are building an application to manage employee data for a company. Implement an "Employee" class with data members like name, employee ID, designation, and salary. The default constructor will initialize the employee with default values like "Unknown" for name and designation, ID set to zero, and salary set to the minimum wage. Create an object using the default constructor to represent a new employee and display their details.
 */