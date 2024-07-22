public class CountingRepeatedLetters {
    public static void main(String[] args) {
        String name = "jav";
        char[] ch = name.toCharArray();
        int count = 0;
        boolean hasRepeating=false;
        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {
                count = 0;
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\0';
                }
            }
            if (count > 0) {
                hasRepeating = true;
                System.out.println(ch[i] + ":" + count);
            } 
        }
        if (!hasRepeating) {
            System.out.println(-1);
        }
    }
}
