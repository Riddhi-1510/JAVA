import java.util.Scanner;
public class Str4 {
    public static void main(String[] args) {
        String s1 = "Hello java";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Word : ");
        String a = scan.next();
        if(s1.contains(a)){
            System.out.println("s1 contains the user input");
        }else{
            System.out.println("s1 is not contains the user input");
        }
    }
}

/*
 4. String Manipulation: Modify the program to take an additional user input (a string) and then check if 's3' contains the user-input string. If it does, print "s3 contains the user input," otherwise, print "s3 does not contain the user input."

 */