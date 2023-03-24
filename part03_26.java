
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = ("");
        
        while (! (input.equals("halted"))){

            input = scanner.nextLine();
            String[] alreadySplit = input.split(" ");
            
            for (int i = 0; i < alreadySplit.length ; i++) {
                System.out.println(alreadySplit[i]);

            }
        }        
    }
}

// The output is as desired, but the testing module does not accept this solution. dont know why, gonna look up other peoples solutions.
// ???
