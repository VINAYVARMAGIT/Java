public class SelectionSort {
    public static void main(String[] args) {
        int [] a ={2,7,8,4,8,4};

        int [] afterSort = selectionSort(a);

        for (int i : afterSort) {
            System.out.print(i);
        }
    }
    public static int[] selectionSort(int[] a){
        
        for (int i = 0; i < a.length-1; i++) {
            int index = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[index]>a[j]) index = j;
                }
                if (index != i) {
                    int temp = a[index];
                    a[index]= a[i];
                    a[i] = temp;
            }
        }  
        return a;
    }
}
