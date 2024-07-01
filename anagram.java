import java.util.*;

class anagram {
    public static void main(String[] args) {
        String s1 = "abcay";
        String s2 = "cbaaya";
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (hm1.containsKey(s1.charAt(i))) {
                hm1.put(s1.charAt(i), hm1.get(s1.charAt(i)) + 1);

            } else {
                hm1.put(s1.charAt(i), 1);

            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (hm2.containsKey(s2.charAt(i))) {
                hm2.put(s2.charAt(i), hm2.get(s2.charAt(i)) + 1);

            } else {
                hm2.put(s2.charAt(i), 1);

            }
        }
        System.out.println(hm1.equals(hm2));

    }
}
