import java.util.Arrays;
import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {
        
        //object
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
            maxi = Math.max(maxi,arr[i]);
        }

        System.out.println("Maximum element is : " + maxi);

        
    }
    
}

/*
1. Write a program to find the maximum element in an array.
 */