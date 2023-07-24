import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter a number Between 0 to 1000");
            int num = scan.nextInt();
            int temp = num;
            int sum = 0;
            while(num!=0){
                int rem = num%10;
                sum += rem;
                num = num/10;
            }
            System.out.println("Sum Of all digits in" + temp + " is " + sum );
        }
    }
}

/*
 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16 
 */