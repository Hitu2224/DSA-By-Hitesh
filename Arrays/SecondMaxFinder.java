import java.util.Scanner;

public class SecondMaxFinder {


    static int findMaxNum(int[] arr){
         int max= Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
              max=arr[i];
            }

         }
         
            return max;


    }

    static int SecondMaxNum(int[] arr) {
        int secmax=findMaxNum(arr);
       for(int i=0;i<arr.length;i++){
        if(arr[i] == secmax){
            arr[i]= Integer.MIN_VALUE;
        }

       }

       int sec=findMaxNum(arr);
    
        return sec;
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

        System.out.println("Second Max number is " + SecondMaxNum(arr));
    
}
}
