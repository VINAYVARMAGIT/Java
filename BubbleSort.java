class BubbleSort{
    public static void main(String[] args) {
        int [] a = {3,7,5,9,1};

        int [] afterSort = bubbleSort(a);

        for (int i : afterSort) {
            System.out.print(i);
        }
    }

    public static int[] bubbleSort(int []a){
        
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp = a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        
        return a;
    }
}