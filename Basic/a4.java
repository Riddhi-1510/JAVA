import java.util.Arrays;
import java.util.Scanner;


public class a4 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        
        System.out.println("Enter K : ");
        //obj
        Scanner scan = new Scanner(System.in);
        int k  = scan.nextInt();
        int a2[] = new int[5];
        for(int i=0;i<5;i++){
            a2[k] = arr[i];
            
            if(k==4){
                k=0;
                continue;
            }
            k++;
        }
        for(int i=0;i<5;i++){
            System.out.print(a2[i] + " ");
        }
        

    }
}

/*
3. Implement a program to rotate the elements of an array to the right by a given number of positions. For example, if the array is [1, 2, 3, 4, 5] and the rotation is 2 positions, the resulting array would be [4, 5, 1, 2, 3].


[1, 2, 3, 4, 5] 
[4, 5, 1, 2, 3]
 */