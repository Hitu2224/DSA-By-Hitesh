public class SwapTowNum {



    static void swap(int a,int b){

        System.out.println("Befor Swap: a = " + a + " b = " + b );
          
           int temp=a;
           a=b;
           b=temp;

        System.out.println("After Swap: a = " + a + " b = " + b );     
    }
    
public static void main(String[] args) {
    int a=5;
    int b=8;
    swap(a,b);
    
        
}
    
}
