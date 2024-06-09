import java.util.Scanner;

public class NewHollowPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
         int sps = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
                
            }
            for (int j = 0; j<sps ; j++) {
                System.out.print(" ");               
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");           
            }
            sps+=2;
            System.out.println("");          
        }

        for (int i =0;i<n ; i++) {

            for (int j = n; j >=n-i ; j--) {
                System.out.print("*");
                
            }
            for (int j = 0; j<sps-2 ; j++) {
                System.out.print(" ");               
            }
            for (int j = n; j >= n-i; j--) {
                System.out.print("*");           
            }
            sps-=2;
            System.out.println("");          
        }


    }

}
