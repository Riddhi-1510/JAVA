class Employee{
    int empId;
    String empName;
    double empSalary;
    String empDesignation;

    Employee(int eId,String eName,double eSalary,String eDesignation){
        empId = eId;
        empName = eName;
        empSalary = eSalary;
        empDesignation = eDesignation;
    }
    void printData(){
        System.out.println("Emp id is  : " + empId);
        System.out.println("Emp Name : " + empName);
        System.out.println("Emp salary is : " + empSalary);
        System.out.println("Emp Designations is : "+empDesignation);
    }

};

public class task7 {
    public static void main(String[] args) {

        Employee obj = new Employee(123,"Ajay",200000000.00,"Worker");
        obj.printData();
    }
}


/*
Task (Parameterized Constructor):

Problem 1: Employee Information
Create a Java class "Employee" with private data members such as empId (int), empName (String), empSalary (double), and empDesignation (String). Implement a parameterized constructor to initialize these data members. Also, provide methods to display the employee details.



 */