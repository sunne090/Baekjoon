class Solution {
    public int solution(int[] array) {
        int[] countArr = new int[1000];
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }
        for(int i = 0; i < countArr.length; i++){
            if(countArr[i] > max){
                max = countArr[i];
                answer = i;
            } else if(countArr[i] == max){
                answer = -1;
            }
        }
        return answer;
    }
}