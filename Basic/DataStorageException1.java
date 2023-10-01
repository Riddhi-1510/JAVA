import java.util.*;

class DataStorageException extends Exception{
    DataStorageException(String s){
        super(s);
    }
}               

public class DataStorageException1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yes/no if data store then yes or no : " );
        String flag = scan.next();
        try{
            yesOrNot(flag);
        }catch(DataStorageException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
    public static void yesOrNot(String flag) throws DataStorageException{
        if(flag.equalsIgnoreCase("no")){
            throw new DataStorageException("dATA CANNOT BE SAVED DUE TO NETWORK ISSUES");
        }else{
            System.out.println("DATA IS STORED");
        }
    }
}

/*
5. Medical Records System:
   - Scenario: A medical records system is storing patient data, but a network interruption occurs while saving data.
   - Exception: Handle a "DataStorageException" when data cannot be saved due to network issues.
 */