
// Java program to ReverseString using StringBuilder
import java.lang.*;
import java.io.*;
import java.util.*;
public class StrBuff8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scan.nextLine();

        int cntWord=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                cntWord++;
            }
        }
        String strArr[] = new String[cntWord];
        String s="";
        int j=0;
        for(int i=0;i<str.length();i++){
           
            if(str.charAt(i)==' '){
                strArr[j]=s;
                j++;
                s="";
            }else{
                s = s + str.charAt(i);
            }
        }
        strArr[j]=s;
        String mainAns="";
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].length()%2==0){
                
                StringBuilder b = new StringBuilder();
                b.append(strArr[i]);
                strArr[i] = b.reverse().toString();
 
            }
            mainAns = mainAns + strArr[i] + " ";
        }
        System.out.println(mainAns);
    }
    
}
/*
Write a Java program that reverses all odd-length words in a string.

Sample Output:

Original text: Check two consecutive identical letters in a given string

Reverses the words in the string that have odd lengths:
Check two consecutive identical letters ni a given gnirts

Original text: Create a Date object using the Calendar class

Reverses the words in the string that have odd lengths:
etaerC a etaD tcejbo using the radnelaC class
 */