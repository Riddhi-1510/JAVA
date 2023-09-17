import java.util.Scanner;
public class Str7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter str : ");
        String s = scan.nextLine();
        if(s.length()<16){
            System.out.println("Password length is too short.");
        }
        int flag = 0,upper=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')){
                flag = 1;
            }
            else if((s.charAt(i)>='A' && s.charAt(i)<='Z')){
                upper = 1;
                flag = 1;
            }
            else{
                flag = 0;
            }
        }
        if(flag != 0 ){
            System.out.println("Password does not contain any special characters.");
        }
        if(upper == 1){
            System.out.println("Password does not contain any uppercase letters.");
        }
    }
}

/*
7. Password Strength Checker: Build a password strength checker that assesses a user's password based on criteria such as length, special characters, and uppercase/lowercase letters.
Example:
    Input: "HelloWorld"

    Output:
    Password length is too short.
    Password does not contain any special characters.
    Password does not contain any uppercase letters.

 */