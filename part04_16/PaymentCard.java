public class PaymentCard {

    private double balance;

    public PaymentCard(double initBalance){
        this.balance = initBalance;
    }

    public void eatAffordably(){
        if (balance < 2.60){
            //System.out.println("you broke son!");
        }else{this.balance = balance - 2.60;}
        //assert this.balance >= 2.60 : "Not enough funds";
        //this.balance = balance - 2.60;
        //System.out.println(this.balance);
    }

    public void eatHeartily(){
        if (balance < 4.60){
            //System.out.println("you broke son!");
        }else{this.balance = balance - 4.60;}
        //assert this.balance >= 4.60 : "Not enough funds";
        //this.balance = balance - 4.60;
        //System.out.println(this.balance);
    }

    public void addMoney(double amount){
        if (amount > 0){
            this.balance = balance + amount;
        }
        if (this.balance >= 150.00){
            this.balance = 150.00;
        }

    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }
}
