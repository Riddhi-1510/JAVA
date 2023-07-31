import java.util.Scanner;
import java.util.Arrays;

public class a8 {
    public static void main(String[] args) {
       
        //scanerobj
        Scanner scan = new Scanner(System.in);

        //array
        int arr[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        //print arr
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int arr1[][] = new int[3][3];

        //ans.....
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[j][i] = arr[i][j];
            }
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
5. Transpose a matrix (rows and columns are swapped)
ex: [[1,2,3], [4,5,6], [7,8,9]] -> [[1,4,7], [2,5,8], [3,6,9]]

1 2 3
4 5 6
7 8 9

1 4 7
2 5 8
3 6 9
*/