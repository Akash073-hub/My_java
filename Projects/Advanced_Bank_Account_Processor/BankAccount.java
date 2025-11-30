package Advanced_Bank_Account_Processor;

import java.util.*;
import Advanced_Bank_Account_Processor.InsufficientBalanceException;
import Advanced_Bank_Account_Processor.NegativeAmountException;
import java.util.ArrayList;
import java.util.List;


class BankAccount extends Transaction{
    int accountNumber;
    String accountHolderName;
    double balance;
    List<Double> allAmounts = new ArrayList<>();
    BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void checkLast5Transactions() {
        double[] last5Transactions = new double[5];

        double highest = 0;
        double lowest = Integer.MAX_VALUE;

        double sum = 0;

        for (int i = 0; i < last5Transactions.length; i++) {

            if (highest < last5Transactions[i]) {
                highest = last5Transactions[i];
            }
            if (lowest > last5Transactions[i]) {
                lowest = last5Transactions[i];
            }
        }
        for (int i = 0; i < last5Transactions.length; i++) {

            sum += last5Transactions[i];
        }
        double avg =( sum/(last5Transactions.length));
        for (int k=0;k<last5Transactions.length;k++){
            allAmounts.add(last5Transactions[k]);
        }

    }
    void withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
        if(amount < 0){
            throw new NegativeAmountException("Amount cannot be negative");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }
    @Override
    public void process(double amount){
        System.out.println("Savings account " + this.accountNumber + " with balance " + this.balance);
    }

}
