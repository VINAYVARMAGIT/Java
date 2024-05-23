import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Rev {

    public static void main(String[] args) {
        
        Character[] characters = {'s', 'v', 'i'};

        List<Character> list1 = Arrays.asList(characters);
        //System.out.println("Original list: " + list1);
        output(list1);

        Collections.reverse(list1);
       // System.out.println("Reversed list: " + list1);
       output(list1);
        Character[] newCharacters = new Character[3];
        List<Character> list2 = Arrays.asList(newCharacters);

        Collections.copy(list2, list1);
        output(list2);
        // System.out.println("copied list:" + list2);
          
        Collections.fill(list1, 'x');
        output(list1);
    }

    private static void output  (List<Character> thelist){

        for(Character things : thelist)
        System.out.printf("%s ", things);

        System.out.println();
        


        
    }
}
