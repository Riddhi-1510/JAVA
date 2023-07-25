import java.util.Scanner;
import java.util.Arrays;
public class arrayClass {
    public static void main(String[] args) {
        int arr[] = new int[5]; //array declaration

        for(int i=0;i<5;i++){
            //random element....
            arr[i] = (int)(Math.random()*100);
        }

        //printting the elemnts...
        for(int i : arr){
            System.out.print(i+" ");
        }//foreach loop...

        //convert array to string....
        System.out.println("Array elements are: " + Arrays.toString(arr));

        //2D ---array
        int [][]a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }

        //print 2D array.....

        for(int[] is: a){
            System.out.println(Arrays.toString(is));
        }

        //sort 1D string....
        Arrays.sort(arr);

        //binary_Searching...
        int index = Arrays.binarySearch(arr,10);

        //copyOf
        int arr2[] = Arrays.copyOf(arr,5);//new length of arr2 is 5

        //copyOfRange
        int arr3[] =  Arrays.copyOfRange(arr,1,3);//stargin index and ending index

        //cheack isEqual or not....
        boolean yup = Arrays.equals(arr,arr2); //array-no-1 and array-no-2

        //fill
        int arr4[] = new int[4];
        Arrays.fill(arr4,5);


        //hashCode----give add...
        System.out.println("HashCode is : " + Arrays.hashCode(arr));

        //convert to string...
        System.out.println("ToString is : " + Arrays.toString(arr));

    }
}
