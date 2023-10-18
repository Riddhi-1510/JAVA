package packages;

public class User {
      String name;
      String accountNumber;
      int balance;
      int lastTransactionHistory;

      public void userFillForm(String name,String accountNumber,int balance,int lastTransactionHistory){
          this.name = name;
          this.accountNumber = accountNumber;
          this.balance = balance;
          this.lastTransactionHistory = lastTransactionHistory;
      }

      public void getUserDetails(){
        System.out.println("User Name is : " + name);
        System.out.println("User AccountNumber is : " + accountNumber);
        System.out.println("User Balance is : " + balance);
        System.out.println("User LastTransactionHistory is : " + lastTransactionHistory);
      }
}
/*
1. User Account:
   - Create a 'User' class with attributes like 'name', 'accountNumber', 'balance', and 'transactionHistory'.
   - Use encapsulation to ensure that account details are accessed only through methods, not directly.

 */