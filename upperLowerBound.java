import java.util.*;

public class upperLowerBound {
    public static void main(String[] args) {
        int[] arr = { 8, 22, -5, 10, -22 };
        int target = 28;
        System.out.println(lowerBoundIterative(arr, target));
        System.out.println(lowerBoundBS(arr, target));
        System.out.println(arr[lowerBoundBSRecursive(arr, 0, arr.length - 1, target)]);

    }

    public static int lowerBoundIterative(int[] arr, int target) {
        int low = -1;
        target = 28;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target && arr[i] > low) {
                low = arr[i];
            }
        }
        return low;
    }

    public static int lowerBoundBS(int[] arr, int target) {
        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }

        return arr[r];
    }

    public static int lowerBoundBSRecursive(int[] arr, int low, int high, int target) {
        if (low > high) {
            return high;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] < target) {
            return lowerBoundBSRecursive(arr, mid + 1, high, target);
        } else {
            return lowerBoundBSRecursive(arr, low, mid - 1, target);
        }

    }

}
