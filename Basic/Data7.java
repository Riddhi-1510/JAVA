import java.util.Scanner;

public class Data7 {
    public static void main(String[] args) {
        //obj
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ENter a , b , c : ");
        float a = scan.nextInt();  
        float b = scan.nextInt();
        float c = scan.nextInt();

        double d = b*b - (4*a*c);
        double root1,root2;
        if(d==0){
          root1 = (-b + Math.pow(d,0.5))/(2.0);
          root2 = root1;
          System.out.println("Root1 = Root2 : "+root1);
        }
        else if(d>0){
         root1 = (-b + Math.pow(d,0.5))/(2.0*a);
         root2 = (-b - Math.pow(d,0.5))/(2.0*a);
         System.out.println("Root1 is : "+root1);
         System.out.println("Root2 is : "+root2);
        }
        else{
            System.out.println("NOT Possible :>");
        }
        
         
    }

}
/*
Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195
 */