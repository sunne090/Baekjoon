class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = (int) (n * Math.pow(2, t));
        return answer;
    }
}