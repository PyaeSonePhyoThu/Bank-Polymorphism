public abstract class Account {
    String accountId;
    String accountholder;
    double balance;
    String accounttype;

    public Account(String accountId, String accountholder, double balance, String accounttype)
    {
        this.accountId = accountId;
        this.accountholder = accountholder;
        this.accounttype = accounttype;
        this.balance = balance;
    }

    public Account()
    {

    }

    public abstract void createAccount();

    public void deposit(double amount)
    {
        if(amount < 5000)
        {
            System.out.println("Deposit atleast 100000");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if(amount >= balance)
        {
            System.out.println("Can't withdraw more than " + amount);
        }
        else
        {
            balance -= amount;
        }
    }

    public void displayInformation(String accountid)
    {
        System.out.println("Account ID : " + getAccountId());
        System.out.println("Account Holder Name : " + getAccountholder());
        System.out.println("Balance : " + getBalance());
        System.out.println("Account Type : " + getAccounttype());
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

}