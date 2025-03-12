class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = String.valueOf(num);
        for(int i = 0; i < numStr.length(); i++){
            if(Integer.parseInt(numStr.substring(i, i+1)) == k){
                answer = i+1;
                break;
            }
        }
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
}