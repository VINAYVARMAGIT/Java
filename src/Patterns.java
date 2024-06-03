// import java.util.Scanner;

// public class Patterns {
//     public static void main(String[] args) {
        

//         Scanner s = new Scanner(System.in);
         
//         System.out.print("Enter the number of lines to print:");
//         int row = s.nextInt();

//         for (int i=1; i<=row; i++)
//         {
//           for(int j=1; j<=i; j++)
//           {
//          System.out.print("* ");
//           } 
//           System.out.println();
//         }
//     }

// }

// import java.util.Scanner;

// class Patterns
// {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
// System.out.println("Enter the rows:");
//         int row = s.nextInt();
//         System.out.println("Enter the colums:");
//         int col = s.nextInt();
//         for(int j =0;j<col; j++){
//         for (int i = 0; i < row; i++) {
        
            
            
//             System.out.print("* ");
            
//         }
//         System.out.println("");

//     }
//     }
// }

 import java.util.Scanner;

 class Pattern{

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int row = s.nextInt();
    for(int i =0; i<row; i++)
    {
      //for space 
      for(int j =row; j>i; j--){

        System.out.print(" ");
      }
      for (int k = 0; k<=i; k++) {
        System.out.print("* ");
      }
      System.out.println("");

    }


  }
 }
