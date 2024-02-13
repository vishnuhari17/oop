interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private String username;
    private int accNo;
    private double balance;
    private double interestRate;

    SavingsAccount(String username, int accNo, double balance, double interestRate) {
        this.username = username;
        this.accNo = accNo;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public void viewBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    private String username;
    private int accNo;
    private double balance;
    private double overdraftLimit;

    CurrentAccount(String username, int accNo, double balance, double overdraftLimit) {
        this.username = username;
        this.accNo = accNo;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance - overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }

    public double calculateInterest() {
        // Current account typically doesn't earn interest
        return 0;
    }

    public void viewBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class Bank {
    private Account[] accounts;
    private int numOfAccounts;

    Bank(int size) {
        accounts = new Account[size];
        numOfAccounts = 0;
    }

    void addAccount(Account account) {
        if (numOfAccounts < accounts.length) {
            accounts[numOfAccounts] = account;
            numOfAccounts++;
            System.out.println("Account added successfully.");
        } else {
            System.out.println("Cannot add more accounts. Bank is full.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank(10); // Assume the bank can hold up to 10 accounts

        // Example usage:
        SavingsAccount savingsAccount = new SavingsAccount("John", 1001, 5000, 5); // 5% interest rate
        CurrentAccount currentAccount = new CurrentAccount("Alice", 2001, 10000, 2000); // $2000 overdraft limit

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // You can add more accounts and perform transactions as needed

        // Accessing methods of savingsAccount
        System.out.println("Savings Account:");
        savingsAccount.viewBalance(); // View balance
        savingsAccount.deposit(2000); // Deposit $2000
        savingsAccount.withdraw(1000); // Withdraw $1000
        System.out.println("Interest earned: " + savingsAccount.calculateInterest()); // Calculate interest
        savingsAccount.viewBalance(); // View balance again

        // Accessing methods of currentAccount
        System.out.println("\nCurrent Account:");
        currentAccount.viewBalance(); // View balance
        currentAccount.deposit(3000); // Deposit $3000
        currentAccount.withdraw(15000); // Withdraw $15000 (exceeding overdraft limit)
        currentAccount.withdraw(8000); // Withdraw $8000 (within overdraft limit)
        currentAccount.viewBalance(); // View balance again
    }
}
