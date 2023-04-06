
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextInt() ){
                list.add(scanner1.nextInt());
                if (!scanner1.hasNextLine()){
                    break;
                }
            }
            System.out.print("Lower bound? ");
            int lowerBound = Integer.parseInt(scanner.nextLine());
            System.out.print("Upper bound? ");
            int upperBound = Integer.parseInt(scanner.nextLine());
            for (Integer integer : list) {
                if (integer >= lowerBound && integer <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
        }catch (Exception e){
            System.out.println("L'errör: " + e.getMessage());
        }
        //System.out.println(list.size());

        /*
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());
        for (Integer integer : list) {
            if (integer >= lowerBound && integer <= upperBound) {
                counter++;
            }
        }
        System.out.println("Numbers:" + counter);

         */
    }
}
