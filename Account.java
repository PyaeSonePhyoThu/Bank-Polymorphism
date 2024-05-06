public abstract class Account {
    protected String accountId;
    protected String accountholder;
    protected double balance;
    protected String accounttype;
    protected double overdraftlimit;

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
        System.out.println();
        System.out.println("Account ID : " + getAccountId());
        if(amount <= 5000)
        {
            System.out.println("Deposit atleast 100000");
            System.out.println("-------------------------------------------------");
            return;
        }
        balance += amount;
        System.out.println("Deposited : " + amount + " to Account ID" + getAccountId());
        System.out.println("Current Balance of "+ getAccountId()+ " : " + balance);
        System.out.println("-------------------------------------------------");
    }

    public void withdraw(double amount)
    {   
        System.out.println();
        System.out.println("Account ID : " + getAccountId());
        System.out.println("Withdrawing --------");
        if(amount >= balance)
        {
            System.out.println("Invalid Withdraw Amount");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdraw :" + amount);
            System.out.println("Current Balance of "+ getAccountId()+ " : " + balance);
        }
        System.out.println("-------------------------------------------------");
    }

    public void displayInformation(String accountid)
    {
        System.out.println("Account Type : " + getClass().getName());
        System.out.println("Account ID : " + getAccountId());
        System.out.println("Account Holder Name : " + getAccountholder());
        System.out.println("Balance : " + getBalance());
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

    public abstract void displayOverdraftLimit();

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

}