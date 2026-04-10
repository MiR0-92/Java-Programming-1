import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);


    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int index : array) {
            if (smallest > index) {
                smallest = index;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int start = array[0];
        for (int index = 0; index < array.length; index++) {
            if (start > array[index]) {
                start = array[index];
                smallestIndex = index;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startFrom) {
        int start = table[startFrom];
        int smallestIndex = startFrom;

        for (int index = startFrom; index < table.length; index++) {
            if (start > table[index]) {
                start = table[index];
                smallestIndex = index;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array){

        for(int index = 0; index < array.length; index++){
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array,index), index);
        }
    }

}
