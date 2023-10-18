import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Date : ");
        String date = scan.next();

        String mm = date.substring(0, 2);
        String dd = date.substring(3, 5);
        String year = date.substring(6, 10);
        System.out.println(dd);
        boolean isValidmm = mm.matches("\\d[1-12]");
        boolean isValiddd = dd.matches("\\d[1-31]");
        boolean isValidyear = year.matches(".{4}");

        System.out.println(isValidmm + " " + isValiddd + " " + isValidyear);

        if(isValiddd && isValidmm && isValidyear){
            System.out.println(year + "-" + mm + "-" + dd);
        }else{
            System.out.println("ERROR:<");
        }
    }
}

/*
Problem 5: Date Format Conversion
Question: Write a program that converts dates from one format to another (e.g., from "MM/DD/YYYY" to "YYYY-MM-DD") using regex.

Sample Test Case:
- Input: "12/31/2022"
- Output: "2022-12-31"

 */