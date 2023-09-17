import java.util.Arrays;
import java.util.Scanner;
public class Str12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter s1 and s2");
        String s1 = scan.next();
        String s2 = scan.next();
        char [] charA1 = new char[s1.length()];
        s1.getChars(0,s1.length(),charA1,0);
        Arrays.sort(charA1);
        char [] charA2 = new char[s2.length()];
        s2.getChars(0,s2.length(),charA2,0);
        Arrays.sort(charA2);

        if(Arrays.equals(charA1,charA2)){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        }else{
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}

/*
 12. Anagram Checker: Write a function that checks if two words are anagrams of each other (contain the same characters in different orders) without using string sorting or manipulation functions.
Example:
    Input: "listen", "silent"

    Output: "listen and silent are anagrams"

    Input: "hello", "goodbye"

    Output: "hello and goodbye are not anagrams"
 */