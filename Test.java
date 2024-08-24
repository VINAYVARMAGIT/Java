import java.util.ArrayList;
import java.util.Arrays;

class Test11 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("vinay", "varma", "vin"));

        System.out.println(names);  
        names.add(2, "ram");
        for (String string : names) {
            System.out.println(string);
        }
        System.out.println(names.size());
        System.out.println(names.get(2));
    }
}
