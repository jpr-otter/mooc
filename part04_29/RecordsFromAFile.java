
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        System.out.println("Name of the file: ");
        Scanner scannerInput = new Scanner(System.in);
        String input = scannerInput.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(input))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split (",");
                String name = parts [0];
                int age = Integer.parseInt(parts[1]);
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e){
            System.out.println("errrrrror: " + e.getMessage());
        }

    }
}
