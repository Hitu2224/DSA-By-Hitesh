public class secmax {

    public static void main(String[] args) {
        

        int[] array=new int[5];

        int firmax=array[0];
        int secmax=array[1];

        array[0]=1;
        array[1]=45;
        array[2]=4;
        array[3]=76;
        array[4]=33;

        for(int i=0;i<array.length;i++){
            if (array[i]>secmax) {
                System.out.println(secmax);
                
            }

        
        }
    
        }
    
}
