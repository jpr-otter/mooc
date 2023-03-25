
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input;
        int oldestAge = 0;

        while (!(input = scanner.nextLine()).isEmpty()) {
            String[] tmp = input.split(",");
            if (oldestAge < Integer.parseInt(tmp[1])) {

                oldestAge = Integer.parseInt(tmp[1]);
            }
        }
        scanner.close();
        if (oldestAge > 0)
            System.out.println("Age of the oldest:" + oldestAge);

    }

}
