
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))){

            while (reader.hasNextLine()){
                names.add(reader.nextLine());
            }
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            if (names.contains(searchedFor)){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e){
            System.out.println("Reading the file file " + file + " failed.");
        }
    }
}
