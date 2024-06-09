import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the half diamond: ");
        int n = scanner.nextInt(); // n is half the height of the diamond

        // Upper half of the diamond
        for (int i = n; i >= 1; i--) {
            // Print leading stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print trailing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print trailing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
