import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] my_chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(my_chars);
        return new String(my_chars);
    }
}