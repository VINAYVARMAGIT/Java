public class Pascal {
public static void main(String[] args) {
     createPascal(5);
}

public static void createPascal(int n){
    int [][] a = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = i; j>=0; j++) {
            if (j==0 || j==i) {
                a[i][j]= 1;
            }
        }
    }
    for (int[] is : a) {
       for (int is2 : is) {
        System.out.print(is2);
       }
       System.out.println("
       ");
    }
}
}


