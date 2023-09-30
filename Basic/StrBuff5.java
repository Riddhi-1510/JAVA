import java.util.Scanner;

public class StrBuff5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter string : ");
        String str = scan.next();
        String newStr = str.substring(2, str.length());
        if(str.charAt(0)=='g' && str.charAt(1)=='h'){
            newStr = "gh" + newStr;
        }
        else if(str.charAt(0)=='g'){
            newStr = "g" + newStr;
        }
        else if(str.charAt(1)=='h'){
            newStr = "h" + newStr;
        }
        System.out.println(newStr);
        
    }
}

/*
Write a Java program to read a string and return it without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'.

Sample Output:

The given strings is: goat
The new string is: gat

he given strings is: photo
The new string is: hoto

The given strings is: ghost
The new string is: ghost
 */