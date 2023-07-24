import java.util.Scanner;

public class scanner_c {
    public static void main(String[] args) {
        //create new obj of class name is scanner 



        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int N = scan.nextInt();
    
            System.out.print("Enter M : ");
            int M = scan.nextInt();

            int product = N*M;

            System.out.println("Product of two number is : " + product);
        }

    }
}
