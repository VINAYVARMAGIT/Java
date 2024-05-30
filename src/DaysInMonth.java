import java.util.Scanner;

public class DaysInMonth {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      System.out.println("Enter the year:");
      
        int year = s.nextInt();
        System.out.println("Enter the month:");
        
        int month = s.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("This month has 31 days ");
                break;
                case 4:
                case 6:
                case 9:
                case 11: System.out.println("This month has 30 days ");
                    break;
                    case 2 :
                        if((year%4==0 && year%100!=0) || (year%400==0)){
                            System.out.println("This month has 29 days"); 
                        }else System.out.println("This month has 28 days.");
                        break;
            default:System.out.println("Invalid question");
            
                break;
        }
    }

}
