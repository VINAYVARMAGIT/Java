// import java.util.Scanner;

// public class NumRightTri {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n =s.nextInt();
//         int num = 1;
//         for (int i = 1; i <=n; i++) {
//             if (i%2!=0) { 
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num++ + " ");
//             } 
//         }
//         else{
//           int temp = num + i - 1; 
//             for (int j = i-1; j >=0  ; j--) {
//                System.out.print(temp-- + " "); 
//             }
//             num +=i;;
//         }
//             System.out.println();         
//         }
//     }
// }

import java.util.Scanner;

class One{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
           if (i%2==0) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num++ +" ");
            }
        }
           else {
            int temp = num +i;
            for (int j = 0; j <= i; j++) {
                System.out.print(temp-- + " ");
            }
            num +=i+1;
        }
        System.out.println("");
        }
    }
}
