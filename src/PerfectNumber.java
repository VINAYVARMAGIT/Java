// for a given number the addition of factors of the number 
//should be equal to the number itself is perfect number

import java.util.Scanner;

class NoOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=0;
        while(n>0)
        {
         n /=10;
         i++;
        }
        System.out.println("The given number is "+i+" digit number ");
    }


}
