import packages.Bank;

public class BankingSys {
    public static void main(String[] args) {
        Bank bob = new Bank(10000);
        bob.Customer("RajuBhai");
        bob.Account(123,"saving");
        bob.Transaction(230);
    }
}


/*
Package:

Scenario 1: Banking System
Create a package called "bank" that contains classes like "Account," "Transaction," and "Customer" that are related to banking operations. Place these classes in the "bank" package to organize and group them together.

 */