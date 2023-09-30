import java.util.Scanner;

public class StrBuff7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int flag=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Happy");
        }else{
            System.out.println("Unhappy");
        }
    }
}

/*
Write a Java program to check whether a specified character is happy or not. A character is happy when the same character appears to its left or right in a string.

Sample Output:

The given string is: azzlea
Is z happy in the string: true

The given string is: azmzlea
Is z happy in the string: falses
 */