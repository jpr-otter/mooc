
public class Main {

    public static void main(String[] args) {

        Debt mortage = new Debt(120, 5);
        mortage.printBalance();
        mortage.waitOneYear();
        mortage.printBalance();

        int years = 0;
        while (years < 20){
            mortage.waitOneYear();
            years += 1;
        }

        mortage.printBalance();
        // Test your Debt class here
        //Debt mortgage = new Debt(120000.0, 1.01);
        //mortgage.printBalance();

        //mortgage.waitOneYear();
        //mortgage.printBalance();

        //int years = 0;

        //while (years < 20) {
        //    mortgage.waitOneYear();
        //    years = years + 1;
        //}

        //mortgage.printBalance();
    }
}
