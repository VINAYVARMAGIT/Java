import java.util.Scanner;

public class Arrayss {
public static void main(String[] args) {
    int n[] = new int[2];
 // Scanner s =new Scanner(System.in);


    //  String [] input = inputLine.split(" ");
    //  n[0] = s.nextInt();
    //  n[1] = s.nextInt();

    //  for (int j = 0; j < n.length; j++) {

    //  System.out.println(n[j]);
    //  }


    //int num1[3]= {1,2,3};
    int num[][]= new int[2][3];

    num[1][2] = 5;

    for ( int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(num[i][j] + " ");
        }
        System.out.println("");
    }


}
}
