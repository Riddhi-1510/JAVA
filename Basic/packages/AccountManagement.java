package packages;

public class AccountManagement {
    int balance;
    int depositing,withdraw;
    public AccountManagement(int balance){
        this.balance = balance;
    }

    void depositFunction(int depositing){
        this.depositing = depositing;
        balance = balance + depositing;
        System.out.println("Total Balance is After Depositing : " + balance);
    }

    void withdrawFunction(int withdraw){
        if(balance-withdraw >= 500){
            balance = balance-withdraw;
            System.out.println("Total Balance is After Withdrawing : " + balance);
        }
    }
}

/*
6. Account Management:
   - Implement methods for depositing and withdrawing money, ensuring proper balance updates and    transaction recording.

 */