import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        
        int [] a = {2,7,9,57,2};

        insertionSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static int[] insertionSort(int[] a){
      for (int i = 1; i < a.length; i++) {
        
        int key = a[i];
        int j = i-1;
        while (j>-1 && a[j]>key) {
            a[j+1]= a[j];
            j--;
        }
        a[j+1]= key;
      }
        return a;
    }
}
