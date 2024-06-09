import java.util.Scanner;

public class HallowPyramid {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for (int i = 0; i < (n/2)+1; i++) {

        for ( int j = 0; j < n; j++) {
            if (j == (n/2)+1) {
                System.out.print(" ");
            }
            else
            System.out.print("*");
        }
        System.out.println("");
    }
   }
}
