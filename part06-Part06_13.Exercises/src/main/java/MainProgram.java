
public class MainProgram {

    // update here your exercise progress

    public static void  main(String[] args){
        ExerciseManagement exercises = new ExerciseManagement();
        exercises.add("Programming");
        exercises.add("Java");
        exercises.add("JUnit");

        exercises.markedAsCompleted("Programming");
        exercises.markedAsCompleted("Java");
        System.out.println(exercises.isCompleted("Java"));
        System.out.println(exercises.isCompleted("JUnit"));

    }
    public static int partsCompleted() {
        return 1;
    }
}
