import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Validate License : ");
        String vLic = scan.next();

        if(Pattern.matches("[A-Z]{2}[0-9]{3}[A-Z]{2}", vLic)){
            System.out.println("valid");
        }else{
            System.out.println("No Valid");
        }
    }
}

/*
Problem 7: License Plate Recognition
Question: Develop a program to recognize and validate license plate numbers using regex based on a predefined format.

Sample Test Case:
- Input: "AB123CD"
- Output: Valid
 */