import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Phone Number : ");
       String PhoneNumber = scan.next();

       if(Pattern.matches("[^a-z]*[0-9]*",PhoneNumber) && PhoneNumber.length()==10){
           System.out.print("( "+PhoneNumber.substring(0, 3) + " ) " + PhoneNumber.substring(3,6) + "-" + PhoneNumber.substring(6, 10));
       }else{
            System.out.println("Enter valid Phone Number :<");
       }
    }
}

/*
Problem 2: Phone Number Formatting
Question: Create a program to format phone numbers in a specific pattern using regex.

Sample Test Case:
- Input: "1234567890"
- Output: "(123) 456-7890"

 */
