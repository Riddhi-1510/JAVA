import java.util.Scanner;

public class Data6 {
    public static void main(String[] args) {
            System.out.println("Enter a number : ");
            //object
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            int cnt = 0,temp = num;
            while(temp!=0){  
                temp = temp/10;
                cnt++;
            }
            System.out.println("Number of digits is the number : "+ cnt);
    } 
}

/*
 * 
 Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

Test Data
Input an integer number less than ten billion: 125463
Expected Output :

Number of digits in the number: 6
 */