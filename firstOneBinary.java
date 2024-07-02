public class firstOneBinary {
    public static void main(String[] args) {
        int[] arr = { 0, 0,1, 1, 1, 1 };
        int l = 0;
        int r = arr.length - 1;
        int res=-1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == 1) {
                res = mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(res);
    }
}
