import java.util.Scanner;


// Write a Java program to sort an array consisting of only 0s and 1s.
//  The user should enter the array size and elements. After sorting, 
//  all the 0s should appear before all the 1s.

public class Sort {

    static void sortZeroesandones(int[] arr) {
        int n = arr.length;
        int zeroes = 0;

        // Count number bare
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        // Put 0s first, then 1s
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements (only 0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortZeroesandones(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

     
    }
}
