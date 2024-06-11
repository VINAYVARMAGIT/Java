import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n <=1) {
            System.out.println("It's not a prime number.");
        //return;
        }
        for (int i = 2; i <=n/2; i++) {
            if (n%i==0) {
                System.out.println("It's not a prime number.");
                return;
            }

    }
     System.out.println("It's a prime number.");
}

    }

