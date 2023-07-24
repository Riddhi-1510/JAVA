import java.util.Scanner;

public class StringScanner {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // //object
        // Scanner scan = new Scanner(System.in);

        // //char scan
        // System.out.print("Enter char : ");     
        // char ch = scan.next().charAt(0);
        
        // //string first word scan
        // System.out.print("Enter string word : ");
        // String str1 = scan.next();

        // //whole string scan....
        // System.out.print("Enter string : ");
        // scan.nextLine();
        // String str2 = scan.nextLine();

        // scan.close();

        // System.out.println("Ch is : "+ ch);
        // System.out.println("Str1 is : " + str1);
        // System.out.println("Str2 is : "+str2);





        // --------------------------------------------------------------------------------------
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string : ");
            // sc.nextLine();
            String s = sc.nextLine();

            try (Scanner scan1 = new Scanner(s).useDelimiter("\\.")) {
                while(scan1.hasNext()){
                    System.out.println(scan1.next());
                }
            }
        }
        
    }
}



/*
Scanner class is used to get user input, and it is found in the java.util package.

> To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 

Methods: 

1. nextBoolean() - Reads a boolean value from the user
2. nextByte() - Reads a byte value from the user
3. nextDouble() - Reads a double value from the user
4. nextFloat() - Reads a float value from the user
5. nextInt() - Reads a int value from the user
6. nextLine() - Reads a String value from the user
7. nextLong() - Reads a long value from the user
8. nextShort() - Reads a short value from the user
9. close() - Closes the scanner
*/


/*
 * We can have multiple Input Sources for Scanner class: 
 * 1. System.in    -  Keyboard
 * 2. File         -  File
 * 3. String       -  String
 * 4. Socket       -  Network Sockets
 * 5. Process      -  Process I/O
 */