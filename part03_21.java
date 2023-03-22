
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {

        /*
        for( int i : array){

            System.out.print(i);
        }

         */


        for (int i = 0; i < (array.length-1) ; i++) {
            System.out.print(array[i] + ", ");
        }
        // pretty weird again. they wanted me to print x,x,x,x,y could not figute out how to put the last x
        System.out.print(array[array.length-1]);

        /*
        String[] cars = {"Trabbi", "Lada", "Fisker", "Toyoda"};
        for (String i : cars) {
            System.out.println(i);
        }
        */
        // Write some code in here
    }
}
