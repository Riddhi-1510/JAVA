package packages;

public class Account {
    String type;
    Account(){

    }
        Account(String type){
            if(type.equalsIgnoreCase("Saving")){
                System.out.println("Your Account is Saving....");
            }

            if(type.equalsIgnoreCase("Checking")){
                System.out.println("Your Account is Checking...");
            }
        }
}

class Savings extends Account{
    void savingFun(){
        System.out.println("saving Function");
    }
}

class Checking extends Account{
    void checkingFun(){
        System.out.println("checking Function");
    }
}
/*
2. Bank Account Types:
   - Implement different account types, like savings and checking, by using inheritance. Create subclasses for each type, inheriting common attributes and behaviors from a base 'Account' class.

 */