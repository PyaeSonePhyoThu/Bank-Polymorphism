import java.util.Scanner;

public class CurrentAccount extends Account{

    public void createAccount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID : ");
        accountId = scanner.nextLine();
        System.out.print("Enter Account Holder Name : ");
        accountholder = scanner.nextLine();
        System.out.print("Enter Initial Balance : ");
        balance = scanner.nextDouble();
        setOverdraftlimit(2000000);
        displayOverdraftLimit();
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
            displayOverdraftLimit();
            return;
        }
        super.withdraw(amount);
    }

    @Override
    public void displayInformation(String accountid) {
        super.displayInformation(getAccountId());
        System.out.println("Overdraft limit : " + overdraftlimit);
    }

    @Override
    public void displayOverdraftLimit()
    {
        System.out.println("Overdraft limit for Current Account " + overdraftlimit);
    }
    
    

}