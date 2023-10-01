public class BasicException {
    public static void main(String[] args) {
        try{
            System.out.println("Hello".charAt(5));
            System.out.println(4/0);
        }catch(ArithmeticException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

        
        finally {
            System.out.println("Finally block");    // This block is always executed.
        }

    }
}


/*
package: java.lang
parent class: Throwable
Exceptions in Java:
    - Checked Exceptions: Exceptions that are checked at compile time.
    - Unchecked Exceptions: Exceptions that are checked at run time.
    - Errors: Irrecoverable situations that are not checked.
Exception Handling:
To handle these exceptions:
1. try: The code that is prone to exceptions is written in this block.
2. catch: This block catches the exception thrown by the try block.
3. finally: This block is always executed irrespective of the exception.
4. throw: This keyword is used to throw a custom exception.
5. throws: This keyword is used to declare the exceptions that can be thrown by the method.
*/