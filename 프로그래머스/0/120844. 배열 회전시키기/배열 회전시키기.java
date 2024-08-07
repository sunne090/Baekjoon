class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        if(direction.equals("right")){
            //초깃값 세팅: answer의 가장 첫번째 인덱스 값은 numbers의 가장 마지막 인덱스 값
            answer[0] = numbers[numbers.length-1];
            for(int i = 1; i < numbers.length; i++){
                    answer[i] = numbers[i-1];
            }
        }else if(direction.equals("left")) {
            //초깃값 세팅: answer의 가장 마지막 인덱스 값은 numbers의 가장 첫번째 인덱스 값
            answer[numbers.length-1] = numbers[0];
            for(int i = numbers.length-2; i >= 0; i--) {
                    answer[i] = numbers[i + 1];
            }
        }
        return answer;
    }
}