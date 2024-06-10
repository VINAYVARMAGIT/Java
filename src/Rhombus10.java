import java.util.Scanner;

// public class Rhombus10 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();


//         for (int i = 0; i < n; i++) {
      

//         for (int j = 0; j <i ; j++) {
//             System.out.print(" ");
//         }
//             for (int j = 0; j < n; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
        
//     }

// }

class Rhom{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        for (int j = 0; j < i; j++) {
            
            for (int j2 = 0; j2 < j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print("*" +" ");
            }
            System.out.println("");
        }
    }
}