class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        char tmp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = tmp;
        answer = String.valueOf(chars);
        return answer;
    }
}