import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex6 {
    static String ansString(String html){
        Pattern p = Pattern.compile("<.*?>");
        Matcher m = p.matcher(html);
        String result;
        result = m.replaceAll("");
        return result;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter HTML code : ");
        String html = scan.nextLine();

        String ans = ansString(html);

        System.out.println(ans);
    }
}

/*
Problem 6: HTML Tag Removal
Question: Create a tool to remove all HTML tags from a given string using regular expressions.

Sample Test Case:
- Input: "<p>This is a <b>sample</b> text.</p>"
- Output: "This is a sample text."

 */