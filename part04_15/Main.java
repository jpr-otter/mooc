
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Statistics stats = new Statistics();
      // should add :
      // Statistics odd = new Statistics();
      // Statistics even = new Statistics();
      //remove the method from the other class to this main file !!!

        System.out.println("Enter numbers: ");

        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0){
                break;
            }
            stats.addNumber(input);
            stats.even(input);
            stats.odd(input);
        }

        /*
        Statistics stats = new Statistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        */
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum:" + stats.sum());
        System.out.println("Average: " + stats.average());
        System.out.println("Sum of even numbers: " + stats.getEven());
        System.out.println("Sum of odd numbers: " + stats.getOdd());




        /*
        JFrame frame = new JFrame("Pixel Explosion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PixelExplosion());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

         */




        /*
         you can write test code here
         however, remove all unnecessary code when doing the final parts of the exercise
         In order for the tests to work, the objects must be created in the
         correct order in the main program. First the object that tracks the total
         sum, secondly the object that tracks the sum of even numbers,
         and lastly the one that tracks the sum of odd numbers!
        */

    }
}
