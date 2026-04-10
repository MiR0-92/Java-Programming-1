
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<TeamStatistics> teamList = new ArrayList<>();
        try (Scanner readFromFile = new Scanner(Paths.get(file))) {

            while (readFromFile.hasNextLine()) {
                String line = readFromFile.nextLine();
                String[] lineSplit = line.split(",");

                String homeTeamName = lineSplit[0];
                String visitingTeamName = lineSplit[1];

                int homeTeamScore = Integer.valueOf(lineSplit[2]);
                int visitingTeamScore = Integer.valueOf(lineSplit[3]);

                teamList.add(new TeamStatistics(homeTeamName, visitingTeamName, homeTeamScore, visitingTeamScore));
            }
        } catch (Exception e) {
            System.out.println("File is empty or doesn't exist!");
        }
        System.out.println("Team:");
        String chooseTeam = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        for (TeamStatistics team : teamList) {
            if (team.getHomeTeamName().equals(chooseTeam)){
                if (team.getHomeTeamScore() > team.getVisitingTeamScore()){
                    wins++;
                } else {
                    losses++;
                }
            } else if(team.getVisitingTeamName().equals(chooseTeam)){
                if (team.getVisitingTeamScore() > team.getHomeTeamScore()){
                    wins++;
                } else {
                    losses++;
                }
            }
            if (team.toString().contains(chooseTeam)){
                games++;
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
