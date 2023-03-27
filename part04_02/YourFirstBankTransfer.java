
public class YourFirstBankTransfer {

    public static void main(String[] args) {

        Account matthewAccount = new Account("Matthews account",1000);
        Account myAccount = new Account("My account",0);
        matthewAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(matthewAccount + ", " + myAccount);
        // Do not touch the code in Account.java
        // write your program here
    }
}


/* 

i dont want to get too cocky in the beginning but this was not even worth gittin.
but for consistency... here you go.

*/
