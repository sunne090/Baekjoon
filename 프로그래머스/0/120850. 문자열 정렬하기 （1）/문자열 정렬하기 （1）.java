import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i)>= 48 && my_string.charAt(i)<=57){
                arr.add(String.valueOf(my_string.charAt(i)));
            }
        }
        answer = new int[arr.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] = Integer.parseInt(arr.get(j));
        }
        Arrays.sort(answer);
        return answer;
    }
}