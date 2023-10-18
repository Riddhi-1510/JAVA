import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Regex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String email = scan.next();

        System.out.println(Pattern.matches("[a-z]*[0-9]*@gmail.com",email));


    }
}
/*
Problem 1: Email Validation
Question: Write a Java program to validate email addresses using regular expressions.
riddhimistry15@gmail.com
 */