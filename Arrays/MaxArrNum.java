import java.util.Scanner;

public class MaxArrNum {


    static int MaxNum(int[] arr){

        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }

        return max; 
    }
    

    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
         int result=MaxNum(arr);
        System.out.println("Max elemnt is" + result);
        
    }
    
}
