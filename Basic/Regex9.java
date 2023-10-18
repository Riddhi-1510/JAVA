import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cradit card Number : ");
        String vLic = scan.nextLine();

        if(Pattern.matches("(\\d{4}).(\\d{4}).(\\d{4}).(\\d{4})", vLic)){
            System.out.println("valid  "  + vLic.substring(15, 19));
        }else{
            System.out.println("No Valid");
        }
    }
}
/*
Problem 9: Credit Card Number Masking
Question: Implement a program to mask all but the last four digits of a credit card number using regex.

Sample Test Case:
- Input: "1234 5678 1234 5678"
- Output: "5678"

 */