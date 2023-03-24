
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String avClub = scanner.nextLine();

            if (avClub.equals("")) {
                break;
            }

            String[] fragmented = avClub.split(" ");

            for (int i = 0; i < fragmented.length; i++) {
                if (fragmented[i].contains("av")) {
                    System.out.println(fragmented[i]);
                }
            }
        }
    }
}
