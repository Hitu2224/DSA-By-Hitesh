import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class findrepeartednum {

    static int RepeatNum(int[] arr){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    return arr[i];
                    
                }
            }  
        }
      
    
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size");
        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        
    int repeated=RepeatNum(arr);

    if (repeated != -1) {
            System.out.println("First Repeated number: " + repeated);
        } else {
            System.out.println("No repeated number found.");
        }

    }
}