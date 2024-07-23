// public class ReversingWords {
//     public static void main(String[] args) {
//         String line = "Java is easy";
//         int i = 0;
//         int j = 0;
//         String temp = "";
//         while (j < line.length()) {
//             while (i < line.length() && line.charAt(i) != ' ') {
//                 i++;
//             }
//             int k = i - 1;
//             while (k >= j) {
//                 temp += line.charAt(k);
//                 k--;
//             }
//             if (i < line.length()) {
//                 temp += ' ';
//             }
//             i++;
//             j = i;
//         }
//         System.out.println(temp);
//     }
// }

public class ReversingWords {
    public static void main(String[] args) {
        String l = "Java is easy";
        int i = l.length() - 1;
        int j = l.length() - 1;
        String temp = "";
        while (j >= 0) {
            while (i >= 0 && l.charAt(i) != ' ')
                i--;
            int k = i + 1;
            while (k <= j) {
                temp += l.charAt(k);
                k++;
            }
            i--;
            j = i;
            if (j > 0) {
                temp += " ";
            }
        }
        System.out.println(temp);
    }
}