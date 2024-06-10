import java.util.Scanner;

public class BinToDec {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        // int i =0; 
         int dec=0;
        // while (n>0) {
        //     int r = n%10;
        //     int num = r*(int)Math.pow(2,i);
        //     i++;
        //    dec= dec+ num;
        //    n /=10;
        //    }
        //    System.out.println(dec);

        for (int i = 0;n>0;i++) {
            int r = n%10;
            int num = r * (int)Math.pow(2, i);
            dec = dec +num;
            n /=10;
        }
        System.out.println(dec);
    }
}
