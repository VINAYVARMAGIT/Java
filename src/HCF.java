import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();

        while(b>0){

            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("The HCF of the given numbers is :" + a);
    }

}
