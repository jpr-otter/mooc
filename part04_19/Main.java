import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        //int duration = 0;
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()){
                break;
            }

            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram i: programs
             ) {
            if (i.getDuration() <= maxDuration)
                System.out.println(i);
            ;

        }
    }
}
