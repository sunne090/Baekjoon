class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int num = code;
        for (int i = 1; i <= cipher.length(); i++) {
            if (i == code) {
                answer = answer + cipher.charAt(i-1);
                code += num;
            }
        }
        return answer;
    }
}