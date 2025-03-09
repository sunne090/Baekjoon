class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        answer[0] = max;
        answer[1] = maxIndex;
        return answer;
    }
}