import java.util.Scanner;

public class VowelString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String convert = stringGap(name);
        System.out.println("After converting: "+convert);
    }
   public static String stringGap(String name){
    String converted ="";
    for (int i = 0; i < name.length(); i++) {
       
        if (name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='i' ||name.charAt(i)=='O' ||name.charAt(i)=='U') {
            converted +=" ";
        } else {
            converted +=name.charAt(i);
        }
    }
    return converted;
    }
}
