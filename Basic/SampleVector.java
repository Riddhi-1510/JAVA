import java.util.Scanner;
import java.util.Vector;

class Customer{
	int id;
	String name;

	void scanDataCustomer(){
		System.out.println("Enter Customer's id and Name : ");
		Scanner scan = new Scanner(System.in);
		id = scan.nextInt();
		name = scan.next();
	}

	void printDataCustomer(){
		System.out.println("Customer id is : " + id);
		System.out.println("Customer name is : " + name);
		
	}
}

class Employee{
	int eid;
	String ename;
	
	void scanDataEmployee(){
		System.out.println("Enter Employee's  id and name : ");
		Scanner scan = new Scanner(System.in);
		eid = scan.nextInt();
		ename = scan.next();
	}
	
	void printDataEmployee(){
		System.out.println("Employee's id is : " + eid);
		System.out.println("Employee's name is : " + ename);
	}
}

public class SampleVector{
	public static void main(String args[]){
		Customer objCus = new Customer();
		Employee objEmp = new Employee();
		objCus.scanDataCustomer();
		objEmp.scanDataEmployee();
		Vector myVect = new Vector();
		myVect.add(objCus);
		myVect.add(objEmp);
		Customer objcus = (Customer)myVect.get(0);
		Employee objemp = (Employee)myVect.get(1);
		objcus.printDataCustomer();
		objemp.printDataEmployee();

	}
}