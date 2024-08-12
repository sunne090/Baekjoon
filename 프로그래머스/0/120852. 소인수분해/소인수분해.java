import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if (n % i == 0){
                //몫이 2 이상인 경우가 존재하므로 나눌 수 없을 때까지 나눠준다.
                while (n % i == 0){
                    n /= i;
                }
                arrList.add(i);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}