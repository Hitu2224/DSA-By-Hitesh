import java.util.Scanner;

public class SecMinNum {
    static int findMin(int[] arr){


         int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    

    static int findSecondMin(int[] arr) {
        int min = findMin(arr);

        // Replace all occurrences of min with MAX_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        // Now find min again, which will be second min originally
        int secondMin = findMin(arr);

        return secondMin;
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

        System.out.println("min number is " + findSecondMin(arr));
    
}
}

    
