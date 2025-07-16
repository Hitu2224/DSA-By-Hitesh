import java.util.Scanner;

// Write a Java program to rotate an array to the right by k positions using the Reversal Algorithm.
// The program should take the array size, elements, and rotation count as input from the user.

public class Reversearr {

    // Swap method to swap elements in array
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse elements between indices i and j

    static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Rotate the array in-place by k positions to the right
    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;  // To handle k > n
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        rotateInPlace(arr, k);

        System.out.println("Rotated array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
