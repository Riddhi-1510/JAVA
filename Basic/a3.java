import java.util.Arrays;
public class a3 {
    public static void main(String[] args) {
        
        int arr[] = new int[10];
        int sum = 0;
        for(int i=0;i<10;i++){
            arr[i] = (int)(Math.random()*100);//random value....
            // System.out.println("arr"+ i + " : " + arr[i]);
            sum += arr[i];
        }
        System.out.println("Sum is : "+ sum);
    }
}

/*
3. Write a program to calculate the sum of all elements in an array.
 */