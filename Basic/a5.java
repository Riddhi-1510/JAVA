import java.util.Arrays;

public class a5 {
    public static void main(String[] args) {
        
        int arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2};
        int cnt=0,l=0,r=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                r++;
                cnt++;
            }else{
                l = i;
                r = i;
                cnt = 0;

            }
            
        }
    }
}

/*
1. Write a program to find the longest increasing subarray within an array. The program should return the starting and ending indices of the subarray.
 */