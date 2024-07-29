class Silver {
    public static void main(String[] args) {
        String s = "Vina28var902a";
        char[] ch = s.toCharArray();
        String sum = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                ch[i] = '\u0000';
            }
            if (ch[i] != '\u0000')
                sum += ch[i];
        }
        System.out.println(sum);
    }
}
class Silver1 {
    public static void main(String[] args) {
        String s = "vinayvarma";
        char[] ch = s.toCharArray();
        String sum = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
            if (ch[i]==ch[j]) {
                ch[j] = '\u0000';
            }   
        }
        // if (ch[i] != '\u0000')
        // sum += ch[i];
    }
        System.out.println(ch);
    }
}