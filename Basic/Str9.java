import java.util.Scanner;
public class Str9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word : ");
        String p = scan.next();
        int flag = 0;
        for(int i=0;i<p.length()/2;i++){
            if(p.charAt(i) != p.charAt(p.length()-i-1)){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("NOT P");
        }else{
            System.out.println("YES");
        }
    }
}

/*
9. Palindrome Checker: Develop a program that determines if a given word or phrase is a palindrome (reads the same forwards and backwards) without using string reversal functions.
Example:
    Input: "racecar"

    Output: "racecar is a palindrome"

    Input: "hello"

    Output: "hello is not a palindrome"
 */