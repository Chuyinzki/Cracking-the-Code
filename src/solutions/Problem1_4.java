package solutions;

/**
 * Created by jvillegas on 9/21/16.
 */
public class Problem1_4 {

    public static String removeSpaces(String a, int size) {
        int next = a.length() - 1;
        char space = ' ';
        char[] chars = a.toCharArray();
        for (int i = size - 1; i >= 0; i--) {
            if(next <= i)
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
