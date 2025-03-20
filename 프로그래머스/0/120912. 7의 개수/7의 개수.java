import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String number = Arrays.toString(array);
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == '7'){
                answer++;
            };
        }
        return answer;
    }
}