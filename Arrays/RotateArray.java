import java.util.Scanner;

public class RotateArray {


    static int[] rotatearr(int[] arr ,int k){

        int n=arr.length;
        k=k%n;

        int[] ans=new int[n];
        int j=0;

        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i=0;i<n-k;i++){
              ans[j++]=arr[i];
        }

          return ans;
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

        System.out.println("Enter element k (rotation count)");
        int k=sc.nextInt();
  
        System.out.println("\nOriginal array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        
        int[] rotated = rotatearr(arr, k);

        // Print rotated array
        System.out.println("\n\nRotated array:");
        for (int val : rotated) {
            System.out.print(val + " ");
        }
        

        
    }
    
}
