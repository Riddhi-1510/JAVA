class Student{
    static int fees = 30000;
    String name;
    Student(String name){
        this.name = name;
        fees++;
    }
    void display(){
        System.out.println("Student name is : " + name);
        System.out.println("Student fees is : " + fees);
    }
};

public class StaticE6 {
    public static void main(String[] args) {
        Student s1 = new Student("Raman");
        s1.display();
        Student s2 = new Student("Raju");
        s2.display();
    }
}

/*
 * 
 * 
 * Create a Student Class which will have fees as static variable and name as 
 * non-static variable. Create a constructor which will increment the fees
 * whenever an object is created and sets the name to the parameter passed to
 * the constructor. Create a method to display the name and fees. Create a class
 * called Main which creates two objects of the Student class and display their
 * names and fees.
 */