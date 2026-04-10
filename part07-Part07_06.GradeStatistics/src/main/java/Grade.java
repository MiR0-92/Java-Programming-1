import java.util.ArrayList;

public class Grade {

    private int numberOfPoints;
    private ArrayList<Integer> listOfGrades;

    public Grade(int points) {
        this.numberOfPoints = points;
        this.listOfGrades = new ArrayList<>();
    }
    public void add(int points){
        this.listOfGrades.add(points);
    }
    public int getId() {
        return this.numberOfPoints;
    }

    public static int convertPointsToGrade(int points) {
        if (points < 50){
            return 0;
        } else if (points < 60){
            return 1;
        } else if (points < 70){
            return 2;
        } else if (points < 80){
            return 3;
        } else if (points < 90){
            return 4;
        } else if (points >= 90){
            return 5;
        }
        return -1;
    }

    public static String convertGradeToStars(int grades) {
        String stars = "";
        for (int index = 0; index < grades; index++) {
            if (grades == 0){
                return stars;
            } else stars += "*";
        }
        return stars;
    }

    public static void pointsDistribution(ArrayList<Grade> points) {
        int[] gradesCount = { 0, 0, 0, 0, 0, 0};
        for (Grade point : points) {
            int grade = convertPointsToGrade(point.getId());
            if (grade == 5){
                gradesCount[5] += 1;
            } else if (grade == 4){
                gradesCount[4] += 1;
            } else if (grade == 3){
                gradesCount[3] += 1;
            } else if (grade == 2){
                gradesCount[2] +=1;
            } else if (grade == 1){
                gradesCount[1] += 1;
            } else {
                gradesCount[0] += 1;
            }
        }

        for (int i = 5; i >= 0; i--) {
            String stars = convertGradeToStars(gradesCount[i]);
            System.out.println(i + ": " + stars);
        }
    }
}
