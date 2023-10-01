import java.util.*;
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String s){
        super(s);
    }
}
public class InsufficientFundsException1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int AvailableBalance = 10000;
        System.out.println("Enter Amount For withdraw money : ");
        int withdrawMoney = scan.nextInt();
        try{
            isOkOrNot(AvailableBalance,withdrawMoney);
        }catch(InsufficientFundsException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
    public static void isOkOrNot(int x,int y) throws InsufficientFundsException{
        if(x<y){
            throw new InsufficientFundsException("Not Possible :<  :( ");
        }else{
            System.out.println("Possible :> :) ");
        }
    }
}
/*
2. Bank Account Transactions:
   - Scenario: A customer attempts to withdraw more money from their bank account than the available balance.
   - Exception: Implement exception handling to catch and handle the "InsufficientFundsException."
 */
