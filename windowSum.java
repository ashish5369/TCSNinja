class windowSum {
    public static void main(String[] args) {
        int[] arr = { 18, 22, -5, 8, 21, 58 };
        int k = 3;
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[j];
            if (j - i == k - 1) {
                if (sum > maxSum) {
                    maxSum = sum;

                }
                sum = sum - arr[i];
                i++;
            }
            // System.out.println(sum);
            j++;
        }
        System.out.println(maxSum);
    }
}