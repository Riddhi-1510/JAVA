import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        
        //object create
        try(Scanner scan = new Scanner(System.in)){
               System.out.println("enter F : ");
               int f = scan.nextInt();

               System.out.println("Celsius  : " + ((f-32)*(5/9.0)));
        }
    }
}

// 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
// Test Data
// Input a degree in Fahrenheit: 212
// Expected Output:
// 212.0 degree Fahrenheit is equal to 100.0 in Celsius

