import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        
        int [] a = {1,2,3,4,5};
        int [] result = rotation(2,a);

        System.out.println(Arrays.toString(result));
    }

    public static int[] rotation(int n, int[] a){
        int [] b = a;
      int last = a.length-1;
    
      for (int i = 0; i < n; i++) {
        int ele = a[last];
        for (int j = a.length-2; j>=0; j--) {
           b[j+1]= a[j];
     }
     b[0]=ele;
    }
        return b;
    }
}
