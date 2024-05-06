public class App
{
    public static void main(String[] args) {
        Account account[] = new Account[2];
        account[0] = new CurrentAccount();
        account[1] = new SavingsAccount();

        System.out.println("Creating accounts");
        for(int i = 0; i < account.length; i++)
        {
            System.out.println();
            System.out.println(account[i].getClass().getName());
            account[i].createAccount();
            System.out.println();
        }

        //Displaying Account Information
        System.out.println("Displaying Informations");
        for(int i = 0; i < account.length; i++)
        {
            account[i].displayInformation(account[i].getAccountId());
            System.out.println();
        }
        
        System.out.println("---------------Withdrawing -----------");
        account[0].withdraw(5000000);
        System.out.println();
        account[0].deposit(5000);
        account[0].displayInformation(account[0].getAccountId());
        account[1].withdraw(500000);


        System.out.println("Displaying all information");
        for(int i = 0; i < account.length; i++)
        {
            account[i].displayInformation(account[i].getAccountId());
            System.out.println();
        }

    }
}