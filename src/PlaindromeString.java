import java.util.Scanner;

 class PalindromeString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        boolean isPalindrom = palindromeChecker(name);
        if (isPalindrom) {
            System.out.println("The name is palindrom.");
        }
        else System.out.println("It's not.");
    }

    public static boolean palindromeChecker(String name){

        int i = 0;
        int j = name.length()-1;
        while (i<=j) {
            if (name.charAt(i) != name.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
