package bankAccount;

import java.util.Scanner;

abstract class Bank1 {
       protected int balance;
     protected int previousTransaction;
 }
public class Bank extends Bank1{

    Scanner scanner = new Scanner(System.in);
    public void checkBalance(){ //check Balance
        System.out.println("Your Balance is "+balance);
    }
    public void deposit() {//deposit
        System.out.print("Please enter an amount to deposit ");
        int amount = scanner.nextInt();
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw() { //withdraw
        System.out.print("Enter an amount to withdraw ");
        int amount = scanner.nextInt();
        if(balance>=amount){
            if(amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;
            }
            System.out.println("Withdraw Successful...");
        }else {
            System.out.println("No balance");
        }

    }

    public void getPreviousTransaction() { //Previous Transaction
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0) {
            System.out.println("Withdraw: " +Math.abs(previousTransaction));
        }

        else {
            System.out.println("No Transaction Occured");
        }
    }


}
