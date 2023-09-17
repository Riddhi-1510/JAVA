import java.util.Scanner;
public class Str6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = scan.nextLine();
        int cnt = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                cnt++;
            }
        }
        System.out.println("total word is : " + cnt);
    }
}

/*
6. Word Count: Create a program that takes a sentence as input and counts the number of words in it without using any string methods.
Example:
    Input: "Hello World"

    Output: 2

 */