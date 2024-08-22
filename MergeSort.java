import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] a = {2,6,3,7,5,8};

        sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static int [] sort(int [] a){
        
        
        int [] left= new int[a.length/2];
        int [] right = new int[a.length-left.length];

        if (left.length==0) return left;
        for (int i = 0; i < left.length; i++) {
            left[i]=a[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i]= a[left.length+i];
        }

        sort(left);
        sort(right);
        merge(left, right,a);
        return a;
    }
    public static void merge(int[]a, int[]b,int[]m){
        

        int i=0;
        int j=0;
        int k=0;

        while (a.length>i && b.length>j) {
            if (a[i]<b[j])m[k++]=a[i++];
            else m[k++] = b[j++];
        }
        while (i<a.length)m[k++]= a[i++]; 
        while (j<b.length)m[k++]= a[j++];
        
    }
}


