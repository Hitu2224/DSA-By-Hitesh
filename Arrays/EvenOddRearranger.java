
import java.util.Scanner;

public class EvenOddSorter {

    static void Swap(int[] arr, int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    static void sortEvenOdd(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

         while (left < right) {
          if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
              Swap(arr, left, right);
              left++;
              right--;
      } 
      else if (arr[left] % 2 == 0) {
        left++;
    } else if (arr[right] % 2 == 1) {
        right--;
    }
}

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


       System.out.println("Enter array size");
       int n=sc.nextInt();
        int[] arr=new int[n];
        

        System.out.println("Enter the array elemets");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
  

        sortEvenOdd(arr);        
        System.out.println("Array after Even-Odd arrangement:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        


    }
    
}
