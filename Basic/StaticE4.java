import java.util.*;

public class StaticE4 {
    static int randomG(){
        int x  = (int)(Math.random()*100);
        return x;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int start,end;
        System.out.println("Enter start : ");
        start = scan.nextInt();
        System.out.println("Enter end : ");
        end = scan.nextInt();

        while(true){
            int y = StaticE4.randomG();
            if(y >= start && y <= end){
                System.out.println("Random number Is : " + y);
                break;
            }
        }
    }
}

/*

4. Static Method for Generating Random Numbers:
Problem Statement: Implement a static method in Java to generate random integers within a given range.

 */