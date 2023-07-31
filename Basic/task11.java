import java.util.jar.Attributes.Name;

class Student{
    int rollNumber;
    String name;
    int subject1Marks;
    int subject2Marks;
    int subject3Marks;
    int totalM;
    Student(int rollNumber,String name,int subject1Marks,int subject2Marks,int subject3Marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }
    void totalMarks(){
        totalM = subject1Marks+subject2Marks+subject3Marks;
        System.out.println("Total Marks is : " + totalM);
    }

    void printData(){
        System.out.println("RollNumber is : " + rollNumber);
        System.out.println("Name is : "+name);
        System.out.println("Sub1 is : " + subject1Marks);
        System.out.println("Sub2 is : " + subject2Marks);
        System.out.println("Sub3 is : " + subject3Marks);
        totalMarks();

    }
};

public class task11 {
    public static void main(String[] args) {
        Student obj = new Student(11, "Mahi", 90, 85, 91);
        obj.totalMarks();;
        obj.printData();
    }
}
/*


Problem 5: Student Grades
Create a Java class "Student" with private data members like rollNumber (int), name (String), subject1Marks (int), subject2Marks (int), subject3Marks (int), and totalMarks (int). Implement a parameterized constructor to initialize the roll number, name, and subject marks. Add a method to calculate the total marks and display the student's details along with the total marks.
 */