//Sum of digits factorial digit should be equal to the number

import java.util.Scanner;

public class StrongNumber {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        int r=0,fact,tSum=0;
        while (n>0) {
            r = n%10;
            fact=1;
            for (int i=1; r>=i; i++){
                fact *=i;
                
            }
            tSum +=fact; 
            n/=10;          
        }
        System.out.println(tSum);
        if(m == tSum)System.out.println("Strong number");
        else System.out.println("not a strong number");
    }



}
