class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%6==0){
            answer = n/6;
        } else if(n%3 == 0){
            answer = n / 3;
        } else if(n%2 == 0){
            answer = n / 2;
        } else {
            answer = n;
        }
        return answer;
    }
}