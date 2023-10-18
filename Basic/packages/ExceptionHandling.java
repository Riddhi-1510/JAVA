package packages;
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String s){
        super(s);
    }
}
public class ExceptionHandling {
    int balance;
    int m;
    public ExceptionHandling(int balance,int m){
        this.balance = balance;
        this.m = m;
    }
    
    void raiseErrorIfNotPossible(){
        try{
            if((balance-m) <500){
                throw new InsufficientFundsException("Add money in Your Account....");
            }else{
                System.out.println("Yes Valid Transaction");
            }
        }catch(InsufficientFundsException e){
        
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }

}



/*

4. Exception Handling:
   - Implement custom exceptions like 'InsufficientFundsException' to handle cases where an account balance is insufficient for a transaction.
*/