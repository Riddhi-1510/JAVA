import java.util.*;
public class StrBuff9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
        int arr[] = new int[26];
        str = str.toLowerCase();
        System.out.println(str);
        for(int i=0;i<26;i++){
            arr[i] = 0;
        }
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!=' '){
                arr[(int)str.charAt(i)-97]++;
           }
        }
        for(int i=0;i<26;i++){
            System.out.println(arr[i]);
        }

        int ans=0;
        for(int i=0;i<26;i++){
            if(arr[i]>2){
                ans++;
            }
        }
        System.out.println("Occurs more than twice : " + ans);
    }
}

/*
Write a Java program to count the number of characters (alphanumeric only) that occur more than twice in a given string.

Sample Output:

Original String: abcdaa
Number of duplicate characters in the said String (Occurs more than twice.): 1

Original String: Create a Date Calendar.
Number of duplicate characters in the said String (Occurs more than twice.): 3
 */