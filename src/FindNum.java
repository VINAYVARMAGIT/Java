public class FindNum {
    public static void main(String[] args) {
        int [] arr = {2,5,8,4,6};
        search(arr,4);
    }
    public static void search(int [] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                System.err.println("Found");
            }
        }
    }
}
