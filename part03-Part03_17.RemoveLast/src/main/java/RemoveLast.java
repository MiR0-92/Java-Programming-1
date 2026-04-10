
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("First");
        listOfStrings.add("Second");
        listOfStrings.add("Third");
        listOfStrings.contains("Third");
        System.out.println(listOfStrings);
        removeLast(listOfStrings);
        removeLast(listOfStrings);
        System.out.println(listOfStrings);

    }

    public static void removeLast(ArrayList<String> strings){
        if(strings.isEmpty()){
            System.out.println("The list is empty!");
            return;
        }
        strings.remove(strings.size() -1);
    }
}
