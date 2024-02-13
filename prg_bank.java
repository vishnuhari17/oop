////Write a Java program to create a banking system with three classes - Bank, Savings Account, and CurrentAccount.
////The bank should have a list of accounts and methods for adding them.
////Accounts should be an interface with methods to deposit, withdraw,calculate interest, and view balances.
////SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods
//
//interface Account
//{
//    void deposit(double amount);
//    void withdraw(double amount);
//    double calculate_interest();
//    void view_balance();
//}
//
//class SavingsAccount implements Account
//{
//    String username;
//    int acc_no;
//    double balance;
//    double interestrate;
//    SavingsAccount(String username,int acc_no, double balance,double interestrate)
//    {
//        this.username = username;
//        this.acc_no = acc_no;
//        this.balance = balance;
//        this.interestrate = interestrate;
//    }
//
//    public void deposit(double amount)
//    {
//        balance += amount;
//        System.out.println(amount+" deposited successfully");
//    }
//
//    public void withdraw(double amount)
//    {
//        if(balance<amount)
//        {
//            System.out.println("Cant withdraw...insufficient balance");
//        }
//        else
//        {
//            balance -= amount;
//        }
//    }
//
//    public double calculate_interest()
//    {
//        return balance*(interestrate/100);
//    }
//
//    public void view_balance()
//    {
//        System.out.println("The available balance is : "+balance);
//    }
//}
//
//
//
//public class prg_bank {
//}
