import java.util.Arrays;
import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        
        //object
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
            mini = Math.min(mini,arr[i]);
        }

        System.out.println("Minimum element is : " + mini);

        
    }
    
}

/*
1. Write a program to find the maximum element in an array.
 */
/*
2. Write a program to find the minimum element in an array.

 */