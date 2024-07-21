public class RepeatingLetters {
    public static void main(String[] args) {
        String n = "Javaia";
        String empty = "";

        for (int i = 0; i < n.length(); i++) {
            boolean isRepeated = false;
            for (int j = 0; j < i; j++) {
                if (n.charAt(i) == n.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated) {
                empty += " ";
            } else {
                empty += n.charAt(i);
            }
        }
        System.out.println(empty);
    }
}