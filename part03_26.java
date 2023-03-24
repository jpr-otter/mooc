
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


// classic! i didnt read properly. the script should stop when there is no input instead i thought it should stop if the input is "halted" simply because
// is was the last word in the example outputs for the script... maybe this is why it s not accepted.

/*

i got it i got it... ez fix.


Scanner scanner = new Scanner(System.in);
        String input = ("");

        while (true){

            input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] alreadySplit = input.split(" ");



            for (int i = 0; i < alreadySplit.length ; i++) {
                System.out.println(alreadySplit[i]);

            }
        }
        
        
*/
