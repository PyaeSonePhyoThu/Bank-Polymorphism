public class App
{
    public static void main(String[] args) {
        Account account[] = new Account[2];
        account[0] = new CurrentAccount();
        account[1] = new SavingsAccount();

        for(int i = 0; i < account.length; i++)
        {
            System.out.println(account[i].getClass().getName());
            account[i].createAccount();
            System.out.println();
            account[i].deposit(500000);
            account[i].displayInformation(account[i].getAccountId());
        }

        account[0].withdraw(50000);
        account[1].withdraw(500000);


        System.out.println("Displaying all information");
        for(int i = 0; i < account.length; i++)
        {
            account[i].displayInformation(account[i].getAccountId());
            System.out.println();
        }

    }
}