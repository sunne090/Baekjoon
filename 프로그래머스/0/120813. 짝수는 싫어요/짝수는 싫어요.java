class Solution {
    public int[] solution(int n) {
    	int[] answer;
    	if(n%2 == 0) {
    		answer = new int[n/2];
    	} else {
    		answer = new int[n/2+1];
    	}
    	
    	int a = 0;
        for(int i = 1; i <= n; i=i+2) {
        	if(i %2 != 0) {
        		answer[a] = i;
        		a++;
        	}
        }
        return answer;
    }
}