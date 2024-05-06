import java.util.Scanner;

public class SavingsAccount extends Account{
    double interestrate;
    int duration;

    @Override
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID : ");
        accountId = scanner.nextLine();
        System.out.print("Enter Account Holder Name : ");
        accountholder = scanner.nextLine();
        System.out.print("Enter Initial Balance : ");
        balance = scanner.nextDouble();
        System.out.print("Enter Interest Rate : ");
        interestrate = scanner.nextDouble();
        System.out.print("Enter Duration : ");
        duration = scanner.nextInt();
        setOverdraftlimit(5000000);
        displayOverdraftLimit();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= getOverdraftlimit())
        {
            System.out.println("Can't withdraw " + amount + " due to overdraftlimit.");           
            displayOverdraftLimit();
            return;
        } 
        super.withdraw(amount);
    }

    @Override
    public void displayInformation(String accountid) {
        super.displayInformation(getAccountId());
        displayOverdraftLimit();
    }

    public double calculateInterest()
    {
        return interestrate;
    }

    @Override
    public void displayOverdraftLimit() {
        System.out.println("Overdraft limit for Saving Account : " + getOverdraftlimit());
    }

}