import java.util.Arrays;

public class CopeArray {


    public static void main(String[] args) {
        int[] orignal={1,2,3,4,5,};
        int[] copy=new int[orignal.length];


        for(int i=0;i<orignal.length;i++){
            copy[i]=orignal[i];

        }

        System.out.println(Arrays.toString(copy));
    }
    
}
