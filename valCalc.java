// if value greater than certain number then it wil contribute 1 to the answer else wont contribute anything to the answer
public class valCalc {
    public static void main(String[] args) {
        int[] arr = { 8, 22, -5, 20, 17, 180, 21 };
        int sum = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                sum++;
                max = arr[i];
            }

        }
        System.out.println(sum);

    }
}
