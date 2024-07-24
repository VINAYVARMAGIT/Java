public class CalculatingLettersUsingReplace {
    public static void main(String[] args) {
        String s1 = "JavaScript";
        String s2 = "";

        while (s1.length() != 0) {

            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            int count = s1.length() - s2.length();
            System.out.println(ch + ": " + count);
            s1 = s2;
        }
    }
}

class Anargan {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "car";

        if (s1.length() != s2.length()) {
            System.out.println("IT's not a anargan.");
            return;
        }
        while (s1.length() != 0) {
            char ch = s1.charAt(0);
            s1 = s1.replace(ch + "", "");
            s2 = s2.replace(ch + "", "");

            if (s1.length() != s2.length()) {
                System.out.println("Its not a anargan");
                return;
            }
        }
        System.out.println("It's a Anargan.");
    }
}
