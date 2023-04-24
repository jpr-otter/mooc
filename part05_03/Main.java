
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the edge length of a cube:");
        int input = scanner.nextInt();

        Cube cube = new Cube(input);

        System.out.println("Volume of the cube: " + cube.volume());
        System.out.println(cube);

        // Experiment with your program here
    }
}
