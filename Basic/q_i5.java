class Account{
    protected int money;
    Account(){

    }
    Account(int money){
        this.money = money;
    }
}
class SavingsAccount extends SampleBank{
    int widrow;
    int addmoney;

    SavingsAccount(int widrow,int addmoney){
    System.out.println("Before Widrow Money is : " + money);
        this.widrow = widrow;
        this.addmoney = addmoney;
        if(this.widrow >= money &&( money-widrow>=500)){
            System.out.println("Sorry NOt Possible");
        }else{
            money = money - widrow;
            System.out.println("(Saving)After Widrow money is : " + money);
        }

        if(addmoney!=0){
            money = money + addmoney;
            System.out.println("(Saving)After addMoney is : " + money);
        }
    }
}
class CheckingAccount extends SampleBank{
    int widrow;
    int addmoney;
    CheckingAccount(int widrow,int addmoney){
        this.widrow = widrow;
        this.addmoney = addmoney;
        if(this.widrow >= money){
            System.out.println("Sorry NOt Possible");
        }else{
            money = money - widrow;
            System.out.println("(Checking)After Widrow money is : " + money);
        }

        if(addmoney!=0){
            money = money + addmoney;
            System.out.println("(Cheacking)After addMoney is : " + money);
        }
    }
}
public class q_i5 {

    public static void main(String[] args) {
    
        SavingsAccount obj = new SavingsAccount(100,1000);
        CheckingAccount c = new CheckingAccount(100,2000);
    }
    
}
/*
Scenario 5: Bank Account Inheritance
Create a bank account hierarchy with a base class called "Account" and derived classes like "SavingsAccount" and "CheckingAccount." The base class can define common attributes and methods, while the derived classes can have additional features specific to their account types.
 */