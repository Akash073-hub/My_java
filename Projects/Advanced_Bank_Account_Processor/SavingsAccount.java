package Advanced_Bank_Account_Processor;

public class SavingsAccount extends BankAccount implements Printable {
    double interestRate;
    double yearlyInterest;
    SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
        this.yearlyInterest = balance * (interestRate / 100);
    }
    double deposit(double amount){
        return balance += amount;
    }
    void deposit(double amount, boolean showMessage){
        balance += amount;
        if(showMessage) {
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
    }
    static class INFO {
        String branch;
        String manager;

        INFO(String branch, String manager) {
            this.branch = branch;
            this.manager = manager;
        }
    }
    @Override
    public void process(double amount){
        System.out.println("Savings account " + this.accountNumber + " with balance " + this.balance);
    }
    @Override
    public void printDetails(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate);
        System.out.println("Yearly Interest: " + this.yearlyInterest);
    }

}
