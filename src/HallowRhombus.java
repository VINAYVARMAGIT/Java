import java.util.Scanner;

public class HallowRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int stars=0;
       // int s =0;

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if (j==n/2) {
                    System.out.print(" ");                 
                }
                else System.out.print("*");
            }
            System.out.println("");          
        }
    }
}
