package solutions;

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

}
