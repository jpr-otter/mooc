
public class YourFirstAccount {

    public static void main(String[] args) {


        Account account = new Account("Artos account", 100.00);
        //System.out.println("Initial state");
        //System.out.println(artosAccount);

        /*
        artosAccount.withdrawal(20);
        System.out.println("The balance of Artos account is now: " + artosAccount.saldo());
        System.out.println("End state");
        System.out.println(artosAccount);

         */

        account.deposit(20);
        System.out.println(account);
        // Do not touch the code in Account.java
        // Write your program here
    }
}

