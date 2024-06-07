import java.util.Scanner;

class  RightAngleTriangle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");           
            }
            System.out.println("");

            
        }
    }

}

class Box {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j <row; j++) {
                System.out.print("*");           
            }
            System.out.println("");

            
        }
    }

}
class RightAngleTriangleOtherSide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        
        for (int i =row ; i <= row; i--) {                          
            for (int k=i; k <=row; k--) {
                if(k<row)
                System.out.print(" ");
                else System.out.print("*");           
            }
            System.out.println("");

            
        }
    }

}


