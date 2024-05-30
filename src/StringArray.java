import java.util.Scanner;

public class StringArray {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String month = s.nextLine();
        System.out.println("Enter the month:" + month );
        
        
        String  mon = "jan";

        switch (mon) {
            case "jan":
            System.out.println("this is jan mon");
            break;
            case "feb":
            System.out.println("this is jan mon");
            break;
            case "mar":
            System.out.println("this is jan mon");
            break;
            case "apr":
            System.out.println("this is jan mon");
            break;
            default:
            System.out.println("this is may mon");
            
                break;
        }

    }
}
