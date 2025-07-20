public class Arraydemo {

    public static void main(String[] args) {

        int[] ages = new int[5]; 
        String[] name = {"hello", "Hitesh", "h","K"}; 
        String[][] demo= new String[5][5];
        int [] num= {1,3,4,5,};

        demo[0][0]="apple";
        demo[0][1]="Hello";
        demo[1][0]="demo";
        demo[1][1]="Hell0";

        System.out.println(demo[0]);
        System.out.println(demo[0]);
        System.out.println(demo[1]);

        System.out.println(num[1]);
        System.out.println(num.length);
              
        ages[0] = 34;
        ages[1] = 10;
        ages[2] = 20;
    
        // For each loop
        for(int x:ages){
            System.out.println(x);
        }

        for(int i=0;i<3;i++){
         System.out.println(name[i]);
        }

        System.out.println(ages.length);

        int i=0;
        while (i<4) {
            System.out.println(num[i]);
           i++;  
        }
    }
}
