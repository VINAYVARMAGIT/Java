public class ArrangingLetters {

    public static void main(String[] args) {
        String name = "vinay";
        char[] ch = name.toCharArray();
        char temp;
        for (int i = 0; i < ch.length; i++) {
            // char ch1=ch[i];
            // int n1=(int)ch1;

            for (int j = i + 1; j < ch.length; j++) {
                // char ch2=ch[j];
                // int n2 =(int) ch2;
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String con = new String(ch);
        System.out.println(con);
    }
}
