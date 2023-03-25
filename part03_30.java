
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String input;
        int oldestAge = 0;
        int inputAge;

        while (!(input = scanner.nextLine()).isEmpty()) {

            String[] tmp = input.split(",");
            inputAge = Integer.parseInt(tmp[1]);

            if (oldestAge < inputAge) {
                oldestAge = inputAge;
            }
        }
        scanner.close();
        System.out.println("Age of the oldest:" + oldestAge);
    }

}
