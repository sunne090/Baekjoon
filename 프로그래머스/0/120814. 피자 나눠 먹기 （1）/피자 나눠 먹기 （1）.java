class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%7 == 0) {
        	answer = n/7;
        } else if(n/7 > 0) {
        	answer = n/7+1;
        } else if(n/7 == 0) {
        	answer = 1;
        }
        return answer;
    }
}