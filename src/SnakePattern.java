import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 1;
        int fives = 0;
        for (int i = 1; i <= n; i++) {

           if( i%2!=0){
            
            for (int j = 1; j <= n; j++) { 
                System.out.print(num++ + " ");  
                fives = fives +5;        
            }
        }
        else  { 
        for (int j = 0; j <n; j++) { 
            num = fives +5;
                System.out.print(num--+ " ");          
            }
        }
            System.out.println("");
        }
    }
}
