class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n < 10) {
        	answer = n;
        } else if(n >= 10) {
        	while(n/10 > 0) {
        		answer += n%10;
        		n = n/10;
        	}
        	answer = answer + n;
        }
        return answer;
    }
}