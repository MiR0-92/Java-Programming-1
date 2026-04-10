import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Grade> listOfGrades;

    public UserInterface(){
        this.scanner = new Scanner(System.in);
        this.listOfGrades = new ArrayList<>();

    }

    public void start(){
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            } else if (input < 0 || input > 100){
                continue;
            }
            listOfGrades.add(new Grade(input));
        }
        
        System.out.println("Point average (all): " + printAveragePoints());
        printAveragePassingPoints();
        System.out.println("Pass percentage: " + printPassingInPercentage());
        System.out.println("Grade distribution:");
        Grade.pointsDistribution(listOfGrades);
    }

    public double printAveragePoints(){
        int totalPoints = 0;
        for (int index = 0; index < listOfGrades.size(); index++) {
            totalPoints += listOfGrades.get(index).getId();
        }
        return 1.0 * totalPoints/listOfGrades.size();
    }

    public void printAveragePassingPoints(){
        int totalPassingPoints = 0;
        int count = 0;
        
        for (int i = 0; i < listOfGrades.size(); i++) {
            int pointsInTheCurrentIndex = listOfGrades.get(i).getId();
            if (pointsInTheCurrentIndex >= 50){
                totalPassingPoints += pointsInTheCurrentIndex;
                count++;
            }
        }

        double average = 1.0 * totalPassingPoints/count;
        if (Double.isNaN(average)){
            System.out.println("Point average (passing):-");
            return;
        }
        System.out.println("Point average (passing): " + average);
    }

    public double printPassingInPercentage(){
        int passingCount = 0;
        for (int index = 0; index < listOfGrades.size(); index++) {
            if (listOfGrades.get(index).getId() >= 50){
                passingCount++;
            }
        }
        return 100.0 * passingCount/listOfGrades.size();
    }
}
