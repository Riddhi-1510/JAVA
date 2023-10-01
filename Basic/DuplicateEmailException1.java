import java.util.*;
class DuplicateEmailException extends Exception{
  DuplicateEmailException(String s){
    super(s);
  }
}
public class DuplicateEmailException1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email[] = new String[5];
        email[0] = "abc@gmail.com";
        email[1] = "xyz@gmail.com";
        email[2] = "tyu@gmail.com";
        email[3] = "hjk@gmail.com";
        
        try{
            String s = scan.next();
            compAll(email,s);
        }catch(DuplicateEmailException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }        
    }
    public static void compAll(String email[],String com) throws DuplicateEmailException{
        for(int i=0;i<4;i++){
          if(email[i].equals(com)){
            throw new DuplicateEmailException("DuplicateEmail :<");
          }
        }
        email[4] = com;
        System.out.println("Valid Email :> ");
    }
}

/*
7. Online Registration:
   - Scenario: During user registration on a website, the user tries to register with an email address that is already in use.
   - Exception: Handle a "DuplicateEmailException."

 */