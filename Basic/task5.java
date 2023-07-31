class Student{
    String name;
    int roll_number;
    int std;
    String attendance;
    Student(){
        attendance = "Absent";
    }
    Student(String s){
        attendance = s;
    }
    void PrintAttendance(){
        System.out.println("Attendance is : " + attendance);
    }
};

public class task5 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.PrintAttendance();
        Student obj2 = new Student("122");
        obj2.PrintAttendance();
    }
}

/*
4. School Attendance Tracker:
You are developing a system to track student attendance in a school. Implement a "Student" class with data members for student name, roll number, class, and attendance status. The default constructor will set the attendance status to "Absent" by default. Create an object of the "Student" class using the default constructor to represent a new student and display their attendance status.
 */