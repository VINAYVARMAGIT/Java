public class SubStringsOfAString {
    public static void main(String[] args) {
        String s = "MalayalaM";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 3; j <= s.length(); j++) {
                // System.out.println(s.substring(i, j));
                String s1 = s.substring(i, j);
                boolean check = isPlaindrom(s1);
                if (check) {
                    System.out.println(s1);
                }
            }
        }
    }

    public static boolean isPlaindrom(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// class ChangeName{
//     public static void main(String[] args) {
//         String name = "helloworld";
//         char [] ch = name.toCharArray();
//     String newName="";
//         for (int i = 0; i < ch.length; i++) {
//             if(ch[i]==0) continue;

//             char ch1 = ch[i];
//             int count =1;
//             for (int j = i+1; j < ch.length; j++) {
//               if(ch1 == ch[j])  {
//                count++;
//                ch[j]=0;

//               }
//             }
//             if (count > 1) {
//                 newName+= ch1+count +"";
//             }else{
//                 newName+= ch1;
//             }
//         }
//         System.out.println(newName);
//     }
// }