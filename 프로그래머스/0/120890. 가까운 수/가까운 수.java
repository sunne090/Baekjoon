import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array); //배열을 우선 오름차순으로 정렬함

        for(int i = 1 ; i < array.length ; i++){ //배열을 돌면서
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){ //절대값을 비교하여
                array[0] = array[i]; //대입
            }
        }
        answer = array[0]; //최종값 대입
        return answer;
    }
}