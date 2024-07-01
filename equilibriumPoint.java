public class equilibriumPoint {
    public static void main(String[] args) {
        // finding the prefixSUm
        int[] arr = { 15, 18, 15, 22, 2, 3, 35, 8 };
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        // checking left right sum
        int lsum;
        int rsum;
        int ans = -1;
        for (int i = 1; i < arr.length; i++) {
            lsum = prefixSum[i - 1];
            rsum = prefixSum[arr.length - 1] - prefixSum[i];
            if (lsum == rsum) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}