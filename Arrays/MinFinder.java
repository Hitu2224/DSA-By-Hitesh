public class MinFinder {

    // Method to find the minimum value in the array
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 55, 6, 77};
        int minValue = findMinimum(numbers);
        System.out.println("Minimum value: " + minValue);
    }
}
