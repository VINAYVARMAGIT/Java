import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveDuplicateStringArray{
    public static void main(String[] args) {
        String s1[]={"vinay","varma","siddu","sid"};
        String s2[]={"pro","vinay","jam","sid"};

        String s3[]= removeDuplicates(s1,s2);
        for (String string : s3) {
            System.out.print(string+" ");
        }
  System.out.println();
        Arrays.sort(s3);
        for (String string : s3) {
            System.out.print(string+" ");
        }
    }

    public static String[] removeDuplicates(String[] s1,String [] s2){
        Set<String> set = new HashSet<>();

        for (String string : s1) {
            set.add(string);
        }
        for (String string : s2) {
            set.add(string);
        }
        String s3[]= new String[set.size()];
        int index=0;
        for (String string : set) {
            s3[index++]=string;
        }
        return s3;
    }
}
class FirstThree{
    public static void main(String[] args) {
        String s1[]={"vinay","varma","siddu","sid","vinner","vinni"};
        String s2[]= getOnlyVin(s1);
        for (String string : s2) {
            System.out.print(string+" ");
        }
    }
    public static String[] getOnlyVin(String []  s1){
        List<String>  l = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].charAt(0)=='v'&&s1[i].charAt(1)=='i'&&s1[i].charAt(2)=='n') {
                l.add(s1[i]);
            }
        }
        String s3[]= new String[l.size()];
        int index=0;
        for (String string : l) {
            s3[index++]=string;
        }
        return s3;
    }
}