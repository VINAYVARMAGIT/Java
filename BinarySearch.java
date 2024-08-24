public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
 
        int res = binarySearch(arr, 6);
        System.out.println(res);
    }
    public static int binarySearch(int[] arr,int findNum){
        int left =0;
        int right =arr.length-1;
       
        while (left<right) {
            int mid = left+(right-left)/2; 

            if (arr[mid]==findNum) {
                return mid;
            }
            if (findNum<arr[mid]) {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
