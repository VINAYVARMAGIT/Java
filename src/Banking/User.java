package banking;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Bank b = new Bank(5000);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = s.nextInt();
        try {
            b.withdrawAmount(amount);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        int balance = b.getBal();
        System.out.println("The remaining amount is: " + balance);
    }
}
