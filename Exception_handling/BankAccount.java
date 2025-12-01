
import java.util.*;
import java.lang.System;


public class BankAccount {
    static void main() {
        BankAccount1 var_4 = new BankAccount1("SBIKPD1234", 5000);
        try{
            var_4.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
class BankAccount1 {
    String accountNumber;
    double balance;
    BankAccount1(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }

}
