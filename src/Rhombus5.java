import java.util.Scanner;

public class Rhombus5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");            
            }
            for (int j = 1; j < i*2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n-1; i++) {

            for (int j = n; j <n+i; j++) {
                System.out.print(" ");             
            }

            for (int j = 0; j <((n-i)*2)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");         
        }
       
    }
    
}
