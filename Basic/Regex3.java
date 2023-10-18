import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = scan.next();

        String Length = ".{8,15}";
        String Upper = ".*[A-Z]*";
        String Lower = ".*[a-z]*";
        String SpacialChar = ".*[!@#$%^&*()_+]*";

        boolean isValidLength = password.matches(Length);
        boolean isValidLower = password.matches(Lower);
        boolean isValidUpper = password.matches(Upper);
        boolean isValidSpacialChar = password.matches(SpacialChar);

        System.out.println(isValidLength + " " + isValidLower + " " + isValidUpper + " " + isValidSpacialChar);

        if (isValidLength && isValidUpper && isValidLower && isValidSpacialChar) {
            System.out.println("Strong");
        } else {
            System.out.println("Invalid");
        }
    }
}
/*
 * Problem 3: Password Strength Checker
 * Question: Develop a tool to check the strength of a password using regex to
 * ensure it meets specific criteria (e.g., length, special characters, etc.).
 * 
 * Sample Test Case:
 * - Input: "P@ssw0rd123"
 * - Output: Strong
 * 
 */