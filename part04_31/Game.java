public class Game {

    private String homeTeam;
    private String visitTeam;
    private int homePoints;
    private int visitPoints;
    private String team;

    public Game(String homeTeam, String visitTeam, int homePoints, int visitPoints) {
        this.homePoints = homePoints;
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.visitPoints = visitPoints;
    }

    public boolean matchWinner(String team){
        if (team.equals(homeTeam) && this.homePoints > this.visitPoints){
            return true;
        } else if (team.equals(this.visitTeam) && this.visitPoints > this.homePoints){
            return true;
        }
        return false;
    }


    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitTeam() {
        return visitTeam;
    }

    public void setVisitTeam(String visitTeam) {
        this.visitTeam = visitTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public void setHomePoints(int homePoints) {
        this.homePoints = homePoints;
    }

    public int getVisitPoints() {
        return visitPoints;
    }

    public void setVisitPoints(int visitPoints) {
        this.visitPoints = visitPoints;
    }
}
