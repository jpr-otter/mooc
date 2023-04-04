
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String toCube = scanner.nextLine();
            if (toCube.equals("end")){
                break;
            }
            int intToCube = Integer.parseInt(toCube);
            intToCube *= intToCube * intToCube;
            System.out.println(intToCube);

        }


    }
}
