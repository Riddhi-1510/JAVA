package packages;
class insufficientBalanceException extends Exception{
    insufficientBalanceException(String s){
        super(s);
    }
}

public class FundTransfer {
    int fundAmount;
    int index;
    int balance;
    FundTransfer(int fundAmount,int accountNumber,int j,int balance){
        this.fundAmount = fundAmount;
        this.balance = balance;
    }
    public void checkFundTransferringValidOrNot(){
        try{
            if(balance-fundAmount <1000){
                throw new insufficientBalanceException("Fund Error...");
            }else{
                System.out.println("You can Transfer Funds...."); 
            }
        }catch(insufficientBalanceException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }



}

/*
5. Fund Transfer:
   - Design a method for transferring funds between accounts, which should check for valid account numbers and throw exceptions when necessary.

 */