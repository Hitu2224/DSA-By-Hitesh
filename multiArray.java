public class multiArray {
    public static void main(String[] args) {
        
        int [][] number={{2,3,4,5},{6,7,8,9}};
        int sum=0;
        int [] num={1,2,3,6,7};
    
        int max=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]<max){
                max=num[i];
             
            }
           
        }
         System.out.println(max);


        for(int i=0;i<number.length;i++){
            for(int j=0;j<number[i].length;j++){
                sum += number[i][j];
             //    System.out.println(number[i][j]);

            }

            System.out.println(sum);
           
        }
    }
    
}
