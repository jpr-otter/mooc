
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {

        int counter = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<Game> dataFromFile = new ArrayList<>();

        try (Scanner scan1 = new Scanner(Paths.get(file) ) ){

            while (scan1.hasNextLine()){
                String line = scan1.nextLine();
                String[] components = line.split(",");

                String homeTeam = components[0];
                String visitTeam = components[1];
                int homePoints = Integer.parseInt(components[2]);
                int visitPoints = Integer.parseInt(components[3]);

                dataFromFile.add(new Game(homeTeam,visitTeam,homePoints,visitPoints));
            }
        } catch(Exception e){
            System.out.println("Errör: " + e.getMessage());
        }


        System.out.println("Team: ");
        String teamName = scan.nextLine();
        for (Game game : dataFromFile){
            if ( (game.getHomeTeam().equals(teamName)) || (game.getVisitTeam().equals(teamName)) ){
                counter++;
            }

        }
        System.out.println("Games: " + counter);
        
        /*  NOT DONE YET

        for (Game game:
             ) {
            
        }
        
         */

