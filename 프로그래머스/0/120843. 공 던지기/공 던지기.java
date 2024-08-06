class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i = 1; i <= k-1; i++){
            answer = answer + 2;
            if(answer > numbers[numbers.length-1]){
                answer = answer - numbers.length;
            }
        }
        return answer;
    }
}