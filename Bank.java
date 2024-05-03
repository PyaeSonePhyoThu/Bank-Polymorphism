public class Bank{
    int size;
    int index;
    Account accounts[];

    public Bank(int size)
    {
        this.size = size;
        this.index = 0;
        this.accounts = new Account[size];
    }

    public void createCurrentAccount(int accountId, String accountHolder, double balance, double overdraftLimit)
    {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountId(accountId);
        currentAccount.setAccountholder(accountHolder);
        currentAccount.setBalance(balance);
        currentAccount.setOverdraftLimit(overdraftLimit);
        System.out.println("Create Current Account: " + accountId);
        accounts[index] = currentAccount;
        index++;
    }

    public void createSavingsAccount(int accountId, String accountHolder, double balance, double interestRate)
    {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountId(accountId);
        savingsAccount.setAccountholder(accountHolder);
        savingsAccount.setBalance(balance);
        savingsAccount.setInterestRate(interestRate);
        System.out.println("Create Saving Account : " + accountId);
        accounts[index] = savingsAccount;
        index++;
    }

    public void deposit(int accountId, double amount)
    {
        for(int i = 0; i < accounts.length; i++)
        {
            if(accounts[i] != null && accounts[i].getAccountId() == accountId)
            {
                accounts[i].deposit(amount);
                break;
            }
        }
    }

    public void withdraw(int accountId, double amount)
    {
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null && accounts[i].getAccountId() == accountId) {
                accounts[i].withdraw(amount);
                break;
            }
        }
            
    }

    public void displayBalance(int accountId)
    {
        for(int i = 0; i < accounts.length; i++)
        {
            if(accounts[i] != null && accounts[i].getAccountId() == accountId)
            {
                accounts[i].displayBalance();
                return;
            }
        }
        System.out.println("Invalid Account : " + accountId);
    }
}
