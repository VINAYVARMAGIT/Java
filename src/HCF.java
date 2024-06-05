import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        int n1=a;
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
        int n2 =b;
        while(b>0){

            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("The HCF of the given numbers is :" + a);
    
        int lcm = (n1*n2)/ a;
        System.out.println("LCM of the 2 numbers is:" + lcm);
    }
}
