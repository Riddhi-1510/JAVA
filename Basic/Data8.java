import java.util.Scanner;

public class Data8 {
    public static void main(String[] args) {
        
        //object
        Scanner scan = new Scanner(System.in);
        int y;
        System.out.print("Enter A number: ");
        int num = scan.nextInt();
        int x = num>0 ? 1 : 0;      
        switch(x){
            case 1: System.out.println("Positive");
            break;
            case 0 : 
                     y = num < 0 ? 1 : 0;
                    switch(y){
                        case 0 : System.out.println("Zero");
                        break;

                        case 1 : System.out.println("Negative");
                        break;
                    }
            break;
        }

    }
}

/* 
Create a program that asks the user to enter a number and checks whether it is positive, negative, or zero using switch case.
*/