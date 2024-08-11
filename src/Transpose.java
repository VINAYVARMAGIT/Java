import java.util.Arrays;

class Transpose {
    public static void main(String[] args) {

        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int len = a.length;

        int[][] b = new int[len][len];

        for (int i = 0; i < b.length; i++) {
             for (int j = 0; j < b.length; j++) {
                b[i][j]=a[j][i];
             }

        }
        for (int[] is : b) {
            System.out.println(Arrays.toString(is));
        }
    }
}