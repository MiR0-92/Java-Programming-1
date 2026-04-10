public class TeamStatistics {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public TeamStatistics(String homeTeamName, String visitingTeamName, int homeTeamScore, int visitingTeamScore) {
        this.homeTeam = homeTeamName;
        this.visitingTeam = visitingTeamName;
        this.homeTeamPoints = homeTeamScore;
        this.visitingTeamPoints = visitingTeamScore;
    }

    public String getHomeTeamName() {
        return this.homeTeam;
    }

    public String getVisitingTeamName() {
        return this.visitingTeam;
    }

    public int getHomeTeamScore(){
        return this.homeTeamPoints;
    }

    public int getVisitingTeamScore(){
        return this.visitingTeamPoints;
    }
    public String toString(){
        return this.homeTeam + " vs " + this.visitingTeam + "Score: " + this.homeTeamPoints + " - " + this.visitingTeamPoints;
    }
}
