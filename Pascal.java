public class Pascal {
    public static void main(String[] args) {
        int[][] pascalArray = createPascal(5);

        int space = 0;
        for (int[] is : pascalArray) {
            for (int i = space; i < pascalArray.length; i++) {
                System.out.print(" ");
            }
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println("");
            space++;
        }
    }

    public static int[][] createPascal(int n) {
        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        return a;
    }
}
