class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int num = 0;
        answer = new int[num_list.length/n][n];
        for(int i = 0; i < num_list.length/n; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[num];
                num = num + 1;
            }
        }
        return answer;
    }
}