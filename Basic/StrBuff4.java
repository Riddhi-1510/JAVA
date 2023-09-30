import java.util.Scanner;

public class StrBuff4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scan.next();
        System.out.println("Enter s1 : ");
        String s1 = scan.next();
        System.out.println("ENter s2 : ");
        String s2 = scan.next();

        int x = interleavingOrNot(str,s1,s2);
        if(x==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static int interleavingOrNot(String str, String s1, String s2) {
        
        int j=0,flag1=0,flag2=0;
        int i=0;
        while(i!=str.length()){
            if(str.charAt(i)==s1.charAt(j)){
                j++;
            }
            if(j==s1.length()){
                flag1=1;
                break;
            }
            i++;
        }
        i=0;
        j=0;
        while(i!=str.length()){
            if(str.charAt(i)==s2.charAt(j)){
                j++;
            }
            if(j==s2.length()){
                flag2=1;
                break;
            }
            i++;
        }
        if(flag1==1 && flag2==1){
            return 1;
        }
        return 0;
    }
}

/*
Write a Java program to check whether two strings interlive of a given string. Assuming that unique characters are present in both strings.

Sample Output:

The given string is: PMQNO
The interleaving strings are MNO and PQ
The given string is interleaving: true

The given string is: PNQMO
The interleaving strings are MNO and PQ
The given string is interleaving: false


input: strings: "XXXXZY", "XXY", "XXZ"
Output: XXXXZY is interleaved of XXY and XXZ
The string XXXXZY can be made by 
interleaving XXY and XXZ
String:    XXXXZY
String 1:    XX Y
String 2:  XX  Z

Input: strings: "XXY", "YX", "X"
Output: XXY is not interleaved of YX and X
XXY cannot be formed by interleaving YX and X.
The strings that can be formed are YXX and XYX
 */