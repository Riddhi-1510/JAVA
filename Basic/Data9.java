import java.util.Scanner;

public class Data9 {
    public static void main(String[] args) {
        //object;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Char : ");
        char ch = scan.next().charAt(0);
        int x,y;
        
        x = (ch>='A' && ch<='Z') ?  1 :  0;

        switch(x){
            case 1 : System.out.println("Upper");
            break;
            case 0 : 
                y = (ch>='a' && ch<='z') ? 1 : 0;
                switch(y){
                    case 1 : System.out.println("Lower");
                    break;

                    case 0 : System.out.println("SP character");
                    break;
                }
            break;
        }
        

        
    }
}


/*
Create a program that asks the user to enter a character and determines whether it is an uppercase letter, lowercase letter, digit, or special character using switch case.
 */
