import java.util.Scanner;

class BankAccount{
    String accNumber;
    String accHoldreName;
    double balance;
    String accType;
    BankAccount(String aNumber,String aHolderName,double bal,String aType){
        accNumber = aNumber;
        accHoldreName = aHolderName;
        balance = bal;
        accType = aType;
    }
    void deposit(int addMon){
        balance  += addMon;
    }

    void withdraw(int subMon){
        balance -= subMon;
    }

    void printData(){
        System.out.println("AccNumber is : " + accNumber);
        System.out.println("AccHolderNmae is : "+accHoldreName);
        System.out.println("Balance is : "+balance);
        System.out.println("accType : " + accType);
    }
};

public class task8 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String accNumber;
        String accHoldreName;
        double balance;
        String accType;
        
        System.out.println("Enter Acc number : ");
        accNumber = scan.nextLine();
        System.out.println("Enter Acc HolderName : ");
        accHoldreName = scan.nextLine();
        System.out.println("Enter Acc number : ");
        accType = scan.nextLine();
        System.out.println("Enter Acc Balance : ");
        balance = scan.nextDouble();
        
        BankAccount obj = new BankAccount(accNumber, accHoldreName, balance,accType);
        obj.printData();
        obj.withdraw(10);
        obj.deposit(100);
        obj.printData();
        }
}
/*

Problem 2: Bank Account Management
Develop a Java class "BankAccount" with private data members like accNumber (String), accHolderName (String), balance (double), and accType (String). Implement a parameterized constructor to set these values and include methods to deposit, withdraw, and display the account details.
 */