import java.util.Scanner;

public class TransposeMatricArray {

    static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
             
            }
            System.out.println();
        }

    }

    static void transpose(int[][] a,int n){

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }

        }
        
                
             
    }
        

    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows");
        int n=sc.nextInt();
        System.out.println("Enter columns");
        int n1=sc.nextInt();

        int[][] arr=new int[n][n1];
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

          System.out.println("Original Matrix:");
        print(arr);

        transpose(arr, n);  // in-place

        System.out.println("Transpose Matrix:");
        print(arr);
    

    }
}
