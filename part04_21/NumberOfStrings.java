
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        int counter = 0;
        int counterTwo = 0;
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            list.add(input);
            //System.out.println(list);
            counterTwo++;

        }
        for (String i: list){
            counter++;
        }
        System.out.println(counter);
        //System.out.println(counterTwo);
    }
}
