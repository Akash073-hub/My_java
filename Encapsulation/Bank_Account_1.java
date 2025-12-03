public class Bank_Account_1 {
    private int balance;

    public int getBalance() {
        return balance;
    }
    public int setbalance(int amount) {
        return balance += amount;
    }

    static void main() {
        Bank_Account_1 account = new Bank_Account_1();
        account.setbalance(5000);
        System.out.println("Account Balance: " + account.getBalance());
        account.setbalance(5000);
        System.out.println("Account Balance: " + account.getBalance());
    }
}
