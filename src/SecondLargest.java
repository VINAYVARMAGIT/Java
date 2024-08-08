public class SecondLargest {
    public static void main(String[] args) {
        int [] i = {1,2,3,4,5};

        int first = i[0];
        int second= i[0];
        for (int j = 0; j < i.length; j++) {
            if (first == i[j]) continue;
            if (first >i[j]) {
                second = first;
                first = i[j];
            }
            else if (second>i[j] || first==second) {
                second=i[j];
            }
        }
        System.out.println(second);
    }
}
