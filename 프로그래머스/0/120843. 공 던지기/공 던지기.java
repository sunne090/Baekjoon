class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i = 1; i <= k-1; i++){ //공을 던질 사람의 번호를 구하는 것이므로 k-1 필요(공을 받는 사람이면 k로 해야됨)
            answer = answer + 2;
            if(answer > numbers[numbers.length-1]){
                answer = answer - numbers.length;
            }
        }
        return answer;
    }
}
