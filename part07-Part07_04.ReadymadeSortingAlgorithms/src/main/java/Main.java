import java.util.*;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> stringsList = new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        stringsList.add("Az");
        stringsList.add("ti");
        stringsList.add("tq");
        stringsList.add("moje");
        stringsList.add("ne moje");
        stringsList.add("kvo ti puka");
        stringsList.add("ba li go");
        stringsList.add("az puk poveche");
        stringsList.add("samo test");
        stringsList.add("dano da rabotish ei");


        int[] array = { 3, 1, 5, 99, 3, 12 };
        String[] strings = { "az", "ti", "toi", "tq", "moq", "Airiin" };
        sort(strings);
        sort(array);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(array));
        sortIntegers(integers);
        sortStrings(stringsList);
        System.out.println(integers);
        System.out.println(stringsList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}