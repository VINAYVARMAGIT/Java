import java.util.Scanner;

public class FactorsSum {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");

        int n = s.nextInt();

        int factorsSum =0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {System.out.println(i);

            factorsSum+=i;
            }

        }
        System.out.println("The sum ofthe factors of the number is: " +factorsSum);
        
    }

}
