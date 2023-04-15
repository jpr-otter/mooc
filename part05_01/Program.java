
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        /*

        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        //ClockHand seconds = new ClockHand(60);
        Timer seconds = new Timer(60);
        Timer secondsDividedHundred = new Timer(100);

         */
        Timer timer = new Timer();

        while (true){
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
