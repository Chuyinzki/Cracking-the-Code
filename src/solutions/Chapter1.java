package solutions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by jvillegas on 9/21/16.
 */
public class Chapter1 {

    //////////////////////////////////////////////////Question 1////////////////////////////////////////////////////////

    //O(n^2)
    public static boolean hasUniqueChars(String input) {
        if (input.length() <= 1) return true;
        char[] chars = input.toCharArray();
        /*char[] chars = new char[input.length()];
        for(int i = 0; i < input.length(); i++)
            chars[i] = input.charAt(i);*/
        for (int j = 0; j < input.length() - 1; j++)
            for (int k = j + 1; k < input.length(); k++)
                if (chars[j] == chars[k])
                    return false;
        return true;
    }

    //O(n^2)
    public static boolean hasUniqueChars2(String input) {
        if (input.length() <= 1) return true;
        for (int j = 0; j < input.length() - 1; j++)
            for (int k = j + 1; k < input.length(); k++)
                if (input.charAt(j) == input.charAt(k))
                    return false;
        return true;
    }

    //O(n)
    public static boolean hasUniqueChars3(String input) {
        if (input.length() <= 1) return true;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("" + input.charAt(0), 1);
        Integer d = 1;
        for (int i = 1; i < input.length(); i++)
            if (d.equals(map.put("" + input.charAt(i), d)))
                return false;
        return true;
    }

    //////////////////////////////////////////////////Question 2////////////////////////////////////////////////////////

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
        for (int j = 0; j < b.length(); j++) {
            String character = "" + b.charAt(j);
            Integer num = map.get(character);
            if (num == null || num == 0)
                return false;
            map.put(character, --num);
        }
        return true;
    }

    //////////////////////////////////////////////////Question 4////////////////////////////////////////////////////////

    public static String removeSpaces(String a, int size) {
        int next = a.length() - 1;
        char space = ' ';
        char[] chars = a.toCharArray();
        for (int i = size - 1; i >= 0; i--) {
            if (next <= i)
                break;
            if (space != chars[i]) {
                chars[next--] = chars[i];
                chars[i] = space;
            } else {
                chars[next--] = '0';
                chars[next--] = '2';
                chars[next--] = '%';
            }
        }
        return new String(chars);
    }
}