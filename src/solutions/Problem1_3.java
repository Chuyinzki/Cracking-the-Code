package solutions;

import java.util.Arrays;

/**
 * Created by jvillegas on 9/21/16.
 */
public class Problem1_3 {
    public static boolean isPermutation(String a, String b){
        if(a.length() != b.length())
            return false;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        String sortedA = new String(charsA);
        String sortedB =  new String(charsB);
        return sortedA.equals(sortedB);
    }
}
