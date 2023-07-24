import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){
            long m = scan.nextInt();
            long min = 24*60*365;
            long year = m/min;
            long days = (m/24/60)%360;
            System.out.println("Year is : "+year);
            System.out.println("Days is :"+days);
        }
    }
}

// 4. Write a Java program to convert minutes into years and days.

// Test Data
// Input the number of minutes: 3456789
// Expected Output :
// 3456789 minutes is approximately 6 years and 210 days
