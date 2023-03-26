
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        int inputAge = 0;
        String oldestName = ("");
        String input;
        String inputName;

        while (!(input = scanner.nextLine()).isEmpty()){

            String[] array = input.split(",");
            
            inputName = String.format(array[0]);
            inputAge = Integer.parseInt(array[1]);

            if (oldestAge < inputAge){
                oldestAge = inputAge;
                oldestName = inputName;
            }
        }
        scanner.close();
        System.out.println("Name of the oldest:" + oldestName);
    }
}
