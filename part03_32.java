
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        String name;
        String longestName ="";
        String inputName;
        int inputYear = 0;
        double yearsAverage;
        double sumYears = 0;
        int nameLength = 0;
        int nameLongest = 0;
        int counter = 0;

        while (!(input = scanner.nextLine()).isEmpty()) {

            String[] array = input.split(",");

            inputName = array[0];
            nameLength = inputName.length();
            inputYear = Integer.parseInt(array[1]);
            sumYears += inputYear;
            counter++;

            if (nameLongest < nameLength) {
                nameLongest = nameLength;
                longestName = inputName;
            }
        }
        scanner.close();
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years" + (double)(sumYears / counter));
    }
}
