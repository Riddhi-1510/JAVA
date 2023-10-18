import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex10 {
    public static void main(String[] args) {
        String str = "This is a sample text. It contains sample data.";
        String pattern = "sample";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        String result  = m.replaceAll("<span class='highlight'>" + pattern + "</span>");
        System.out.println(result);

    }
}

/*
Problem 10: Text Search and Highlighter
Question: Create a text search and highlight tool that finds and highlights specific words or phrases in a text document using regular expressions.

Sample Test Case:
- Input Text: "This is a sample text. It contains sample data."
- Search Term: "sample"
- Output: "This is a <span class='highlight'>sample</span> text. It contains <span class='highlight'>sample</span> data."

These test cases demonstrate the expected outputs for the given problem statements. You can use them as a reference to test your Java regex solutions. Tasks {

 */