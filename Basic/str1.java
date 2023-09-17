import java.util.Scanner;
public class str1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter s1 : ");
        String s1 = scan.nextLine();
        System.out.println("ENter s2 : ");
        String s2 = scan.nextLine();
        System.out.println("ENter s3 : ");
        String s3 = scan.nextLine();
        String m = s1.concat(s2);
        System.out.println("Concat s1 + s2 + s3" + m.concat(s3));
    }
}

/*
1. String Concatenation: Modify the code to concatenate 's1', 's2', and 's3' into a single string and print the result. For example, if 's1' is "Hello," 's2' is "World," and 's3' is "Hello World," the program should output "Hello WorldHelloWorld."
 */