import java.util.Arrays;
import java.util.HashSet;
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