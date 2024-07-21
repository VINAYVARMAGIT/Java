import java.util.Scanner;

public class ConsecutiveLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name  = s.nextLine();
        String converted = convertString(name);
        System.out.println("The converted String is : "+converted);
    }
    public static String convertString(String name ){
        String newName =name.charAt(0)+ "";
for (int i = 1; i < name.length(); i++) {

    if (name.charAt(i-1)==name.charAt(i)) {
        newName += '$';
    }
    else{
        newName +=name.charAt(i);
    }
}  
return newName;
    }
}
