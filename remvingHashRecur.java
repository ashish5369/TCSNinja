//abc#xyz
//print {'abc','xyz'}
//using recursion

import java.util.ArrayList;

public class remvingHashRecur {
    public static void main(String[] args) {
        String s = "abc#xyz##yaabc####12";
        ArrayList<String> res = new ArrayList<String>();

        removeHash(s, res, 0, 0);
    }

    public static ArrayList<String> removeHash(String s, ArrayList<String> res, int low, int high) {
        String sum = "";
        while (s.charAt(high) != '#') {
            high++;
            sum += s.charAt(high);
        }

        res.add(sum);
        while (s.charAt(high) == '#') {
            high++;
        }
        removeHash(s, res, high - 1, high - 1);
        return res;

    }
}
