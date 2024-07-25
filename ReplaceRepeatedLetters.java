import java.util.Scanner;

public class ReplaceRepeatedLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String str = "";

        char[] ch = n.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char ch1 = ch[i];
            boolean b = false;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch1 == ch[j]) {
                    ch[j] = '\u0000';
                    b = true;
                }
            }
            if (b) {
                ch[i] = '\u0000';
            }
        }
        System.out.println(ch);
        // for (char c : ch) {
        //     if ( c !='\u0000')
        //         str += c;
        // }
        // System.out.println(str);
    }
}
