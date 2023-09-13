package packages;

public class Bank {
    String name ;
    int totalR;
    String AccountType;
    int AccountNo;
    public Bank(int totalR){
        this.totalR = totalR;
    }
    public Bank(){
        
    }
    public void Account(int AccountNo,String AccountType){
        this.AccountNo = AccountNo;
        this.AccountType = AccountType;
        System.out.println("Account NO : " + AccountNo);
        System.out.println("Account Type : " + AccountType);
    }
    public void Transaction(int x){
        System.out.println("Before Transaction : " + totalR);
        totalR -= x;
        System.out.println("After Transaction : " + totalR);
    }
    public void Customer(String name){
        this.name = name;
        System.out.println("Customer name is : " + name);
    }
}


//"Account," "Transaction," and "Customer"