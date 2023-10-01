import java.util.Scanner;

class InvalidPassportNumberException extends Exception{
    InvalidPassportNumberException(String s){
        super(s);
    }
}

public class InvalidPassportNumberException1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Passport Number : ");
        String passportNumber = scan.next();
        try{
            
             validOrNot(passportNumber);
        }catch(InvalidPassportNumberException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }   
    public static void validOrNot(String number) throws InvalidPassportNumberException{
        if(number.length()>=8 && number.length()<=12){
            System.out.println("valid Number Password");
        }else{
            throw new InvalidPassportNumberException("Invalid Password Number");
        }
    }
}

/*
4. Flight Booking:
   - Scenario: During flight booking, the user provides an invalid passport number, such as one with incorrect formatting.
   - Exception: Implement exception handling for "InvalidPassportNumberException."

 */