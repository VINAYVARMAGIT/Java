import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5,7,8,9,10);
       
       l.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(n -> System.out.println(n));

    //      l1.forEach(num -> System.out.println(num));
     }
}
