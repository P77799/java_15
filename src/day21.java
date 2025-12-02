class BankAccount {
    private String name;
    private double balance;

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw!");
        }
    }

    // Display
    public void displayInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class day21 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Pratik Nepali", 10000);

        acc.displayInfo();
        acc.deposit(3000);
        acc.withdraw(5000);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
