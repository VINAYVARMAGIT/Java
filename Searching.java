public class Searching {
    public static void main(String[] args) {

        int[] a = { 3, 8, 0, 63, 9, 4, 2 };

        System.out.println(search(a, 63));
    }

    public static int search(int[] a, int num) {
        int index = 0;
        boolean found = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                index = i;
            }
        }
        if (!found)
            return -1;
        return index;
    }
}
