import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
        //obj
        Scanner scan = new Scanner(System.in);
        //size
        int size;
        System.out.println("Enter Size of Array : ");
        size = scan.nextInt();

        //array
        int array[] = new int[size];
        //ans-Array
        String ans[] = new String[size];
        //scanTheArray :
        for(int i=0;i<size;i++){
            array[i] = scan.nextInt();
            int temp = array[i];
            String a = "";
            while(temp!=0){
                int rem = temp%2;
                a += (rem);
                System.out.println(a);
                temp = temp/2;
            }
            //reverse String
            String b = "";
            for(int j= a.length()-1;j>=0;j--){
                b += a.charAt(j);
            }
            ans[i] = b;
        }
        //print ans....
        for(int i=0;i<size;i++){
            System.out.print(ans[i] + " ");
        }
        
    }
}

/*
> Array -> array of decimal numbers -> convert it to binary
 */