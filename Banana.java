import java.util.*;

public class Banana {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("vinay");
        al.add("varma");

        System.out.println(al);
        System.out.println(al.get(1));
        al.clear();
        System.out.println(al);
    }
}
