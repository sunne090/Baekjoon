import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my_string_array = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            my_string_array[i] = my_string.toLowerCase().substring(i, i + 1);
            System.out.println(my_string_array[i]);
        }
        Arrays.sort(my_string_array);
        for(int i = 0; i < my_string_array.length; i++) {
            answer+= my_string_array[i];
        }
        return answer;
    }
}