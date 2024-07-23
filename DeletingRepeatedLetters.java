public class DeletingRepeatedLetters {
    // public static void main(String[] args) {
    // String s = "Java Developer";
    // // int index = s.indexOf('a', 2);
    // // System.out.println(index);
    // char []ch = s.toCharArray();
    // String line = "";
    // for (int i = 0; i <s.length() ; i++) {
    // char ch1 = ch[i];
    // if(s.indexOf(ch1) == i){
    // if (ch[i] == ' ') continue;
    // line += ch[i];
    // }
    // }
    // System.out.println(line);
    // }

    public static void main(String[] args) {
        String vowels = "aeiou";
        String name = "vinayou";
        char[] ch = vowels.toCharArray();

        for (int i = 0; i < 5; i++) {
            char ch1 = ch[i];
            if (name.indexOf(ch1) >= 0 && name.indexOf(ch1) <= 9) {

            } else {
                System.out.print(ch1);
            }
        }
    }
}

class Panagram {
    public static void main(String[] args) {
        String name = "vinay";
        String n= "nayvi";
        char [] ch = n.toCharArray();
        String output = checkString(name, ch);
        System.out.println(output);
    }

       public static  String checkString(String name,char [] ch){
        for (int i = 0; i < ch.length; i++) {
            if (name.indexOf(ch[i]) == -1) {
                return "It's not a panagram";
            }
        }
        return "It's a panagram";
    }
}