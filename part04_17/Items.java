
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //String nameInput = "";


        while (true){
            System.out.println("Name: ");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()){
                break;
            }
            items.add(new Item(nameInput));
            //System.out.println(items.toString());

        }
        System.out.println(items.toString());
        /*
        for (Item item: items) {
            System.out.println(items.toString());
        }

         */

    }
}
