package solutions;

import java.util.HashMap;

/**
 * Created by jvillegas on 9/21/16.
 */
public class Problem1_1 {

    //O(n^2)
    public static boolean hasUniqueChars(String input){
        if(input.length() <= 1) return true;
        char[] chars = input.toCharArray();
        /*char[] chars = new char[input.length()];
        for(int i = 0; i < input.length(); i++)
            chars[i] = input.charAt(i);*/
        for(int j = 0; j < input.length() - 1; j++)
            for(int k = j + 1; k < input.length(); k++)
                if(chars[j] == chars[k])
                    return false;
        return true;
    }

    //O(n^2)
    public static boolean hasUniqueChars2(String input){
        if(input.length() <= 1) return true;
        for(int j = 0; j < input.length() - 1; j++)
            for(int k = j + 1; k < input.length(); k++)
                if(input.charAt(j) == input.charAt(k))
                    return false;
        return true;
    }

    //O(n)
    public static boolean hasUniqueChars3(String input){
        if(input.length() <= 1) return true;
        HashMap<String, Integer> map = new HashMap<>();
        map.put(""+input.charAt(0), 1);
        Integer d = 1;
        for(int i = 1; i < input.length(); i++)
            if(d.equals(map.put(""+input.charAt(i), 1)))
                return false;
        return true;
    }
}
