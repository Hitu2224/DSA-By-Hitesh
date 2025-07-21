import java.util.Scanner;

public class PrefixSum {


    static void prefixsum(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }


    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter arr size");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
         System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        
        prefixsum(arr);
         System.out.println("Perfix sum array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }
    
}
