

import java.util.Scanner;

public class RevAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        char letter = 'A';   

        for (int i = 0; i < rows; i++) {
          
             
            if (i%2==0) {                 
                char name = letter;
                for (int j = 0; j <= i; j++) {
                System.out.print(letter);
                letter++;
            }
        }
        else{
          char name = (char) (letter +i);          
            for (int j = 0; j <= i; j++) {
                System.out.print(name);
             name--;     
            }
             letter = (char) (letter +i+1);
        }
          System.out.println("");  
        }
    }
}


