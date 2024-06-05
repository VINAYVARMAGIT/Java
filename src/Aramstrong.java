// The cubes of the digits of a given number should be 
//equal to the number itself ex:153,371,407

import java.util.Scanner;

public class Aramstrong {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int m = n;
        int r =0,tCub=0;
        while(n>0){
            r=n%10;
          int cub=1;
           for (int i=0; i<3;i++){
               cub *=r;       
           }
           tCub += cub;
        n /=10;
        }
        if(m == tCub) System.out.println("It's a Armstrong number.");
        else System.out.println("It's not a Armstrong number.");
    }
}
