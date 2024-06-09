import java.util.Scanner;

public class RightAngleTri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int num = 1;
       for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++) {
            if (j%2==0) {
            System.out.print(num++ +" ");
            }
            else System.out.print("*"+ " ");
        }    

        System.out.println(""); 
       }
    }
}
