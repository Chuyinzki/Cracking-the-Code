package solutions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by jvillegas on 9/21/16.
 */
public class Problem1_3 {
    //O(n*log(n))
    public static boolean isPermutation(String a, String b) {
        if (a.length() != b.length())
            return false;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        String sortedA = new String(charsA);
        String sortedB = new String(charsB);
        return sortedA.equals(sortedB);
    }

    //average   = O(n)
    //worst     = O(n^2)
    public static boolean isPermutation2(String a, String b) {
        if (a.length() != b.length())
            return false;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            String character = "" + a.charAt(i);
            Integer num = map.get(character);
            map.put(character, num == null ? 1 : ++num);
        }
        for(int j = 0; j < b.length(); j++){
            String character = "" + b.charAt(j);
            Integer num = map.get(character);
            if(num == null || num == 0)
                return false;
            map.put(character, --num);
        }
        return true;
    }
}
