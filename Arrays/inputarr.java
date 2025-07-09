import java.nio.channels.Pipe.SourceChannel;
import java.rmi.server.UID;
import java.util.Scanner;

public class inputarr {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter the array size");
        int n = sc.nextInt();

        
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();


        }


         System.out.print(" Your array  elements ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);


        }

    }
    
}
