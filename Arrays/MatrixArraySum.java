import java.util.Scanner;

public class MatricArraySum {


     static void Array(int[][] arr) {
        System.out.println("Matrix form:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }

    static void printMatric(int[][] a,int r1, int c1,int[][] b,int r2,int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong input");
            return;
        }

        int [][] sum=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];

            }
           
        }

         System.out.println("Sum of matrices:");
            Array(sum);

    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        int[][] arr2 = new int[r][c];

        System.out.println("Enter elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

          System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        printMatric(arr, r, c, arr2, r, c);
    }
}
