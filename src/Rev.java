import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Rev {

    public static void main(String[] args) {
        
        Character[] characters = {'s', 'v', 'i'};

        List<Character> list1 = Arrays.asList(characters);
        System.out.println("Original list: " + list1);

        Collections.reverse(list1);
        System.out.println("Reversed list: " + list1);
       
        Character[] newCharacters = new Character[3];
        List<Character> list2 = Arrays.asList(newCharacters);

        Collections.copy(list2, list1);

        System.out.println("copied list:" + list2);
        
      
    
    
    
    }
}
