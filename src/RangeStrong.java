import java.util.Scanner;

public class RangeStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();        

        for (int i = a; i < b; i++) {  
            int num =i;        
            int sum =0;

            while (num>0) {
               int  r = num%10;
                int fact=1;

                for (int j = 1; j <= r; j++) {                  
                    fact *=j;                 
                }
                sum += fact;
                num /=10;
            }
            if (i ==sum) System.out.println(i);              
                       
        }      
    }
}
