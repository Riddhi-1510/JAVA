package packages;

public class Transactions {
    String date;
    int amount;
    String transactionType;
    int index;
    String storeDate[] = new String[1000];
    int storeAmount[] = new int[1000];
    String storeTransactionType[] = new String[1000];
    Transactions(String date,int amount,String transactionType,int i){
        this.date = date;
        this.amount = amount;
        this.transactionType = transactionType;
        this.index = i;
        //store data
        storeDate[i] = this.date;
        storeAmount[i] = this.amount;
        storeTransactionType[i] = this.transactionType;

    }

    //Store Transaction History.....

    public void TransactionHistory(){
        for(int j=0;j<index;j++){
            System.out.println("Transaction Date is : " + storeDate[j]);
            System.out.println("Transaction Amount is : " + storeAmount[j]);
            System.out.println("Transaction Type is : " + storeTransactionType[j]);
        }
    }
}

/*
3. Transactions:
   - Develop a 'Transaction' class that captures transaction details, such as 'date', 'amount', and 'transactionType'.
   - Maintain a transaction history for each account, allowing users to retrieve their transaction history.

 */