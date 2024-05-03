import java.util.Scanner;

public class CurrentAccount extends Account{

    double overdraftlimit;

    // public CurrentAccount(String accountId, String accountholder, double balance, String accounttype) {
    //     super(accountId, accountholder, balance, accounttype);
    // }

    public void createAccount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID : ");
        accountId = scanner.nextLine();
        System.out.print("Enter Account Holder Name : ");
        accountholder = scanner.nextLine();
        System.out.print("Enter Initial Balance : ");
        balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Account Type : ");
        accounttype = scanner.nextLine();
        //scanner.close();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= overdraftlimit)
        {
            System.out.println("Can't withdraw " + amount + " due to overdraftlimit.");
            System.out.println("Overdraft limit : " + overdraftlimit);
        }
        super.withdraw(amount);
    }

    @Override
    public void displayInformation(String accountid) {
        super.displayInformation(getAccountId());
        System.out.println("Overdraft limit : " + overdraftlimit);
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }
    

}