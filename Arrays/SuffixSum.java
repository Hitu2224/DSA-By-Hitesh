import java.util.Scanner;

public class SuffixSum {



    static void suffixsum(int[] arr){
        int n=arr.length;
        
      for(int i = n - 2; i >= 0; i--){
            arr[i] = arr[i]+arr[i+1];


        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter arr size");
        int n=sc.nextInt();


       System.out.println("Enter array elements");
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
         System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
         

         suffixsum(arr);
         System.out.println("Suffix sum array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    
}

