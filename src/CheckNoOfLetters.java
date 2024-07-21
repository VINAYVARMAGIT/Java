import java.util.Scanner;

public class CheckNoOfLetters {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        System.out.println("Enter the String you want to check: ");
        String name = s.nextLine();
        System.out.println("Enter the letter you want to check how many times it will repeat: ");
        char letter = s.next().charAt(0);
        int num = noOfLetters(name, letter);
        System.out.println("The number of letters of "+ letter +" is "+ num);
    }
    public static int noOfLetters(String name, char letter){
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if(letter == name.charAt(i)) count++;
        }
   return count;
    }
}
