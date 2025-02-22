class Solution {
    public int solution(int order) {
        int answer = 0;
        if(order < 10){
            if(order % 3 == 0){
                answer++;
            }
        } else {
            int[] arr = new int[String.valueOf(order).length()];
            for(int i = 0; i < arr.length; i++){
                arr[i] = String.valueOf(order).charAt(i) - '0';
                if(arr[i] != 0 && arr[i] % 3 == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}