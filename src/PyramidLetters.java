import java.util.Scanner;

public class PyramidLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = 'A';
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print("  ");              
            }
            for (int j = 0; j <= i*2; j++) {
                System.out.print(c++ + " ");              
            }
            System.out.println("");
        }
    }
}

