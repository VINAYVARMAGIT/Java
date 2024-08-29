import java.util.*;

class Collection5 {
    public static void main(String[] args) {
        // List values = new ArrayList();

        // values.add("vINAY");
        // values.add(5);
        // values.add(20);
        // values.add(1, values);

        // //One way to show all the elements of the collection is by using the iterator
        // // Iterator m = values.iterator();

        // // while (m.hasNext()) {
        // // System.out.println(m.next());
        // // }

        // //And the other way is to use the enhanced for loop
        // // for (Object i : values) {
        // // System.out.println(i);
        // // }

        // values.forEach(System.out::println);

        List<Integer> al = new ArrayList<>();

        al.add(410);
        al.add(206);
        al.add(402);
        al.add(308);
        al.add(801);
        al.add(107);

        Comparator<Integer> com = new CompCheck();
        Collections.sort(al,com);

        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
