import java.util.Scanner;
public class Str8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email = scan.nextLine();
        int index = -1;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                index = i;
                break;
            }
        } 
        if(index == -1){
            System.out.println("Invalid");
        }else{
            String same = email.substring(index, email.length()) ;
            if(same.equals("@gmail.com")){
                System.out.println("valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}

/*
8. Email Validation: Implement an email validator that checks whether a given string is a valid email address without using regular expressions or string methods.
Example:
    Input: abc@gmail.com

    Output: Valid email address

    Input: abc@gmail

    Output: Invalid email address
 */