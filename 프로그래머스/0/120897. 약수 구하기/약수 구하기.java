class Solution {
    public int[] solution(int n) {
        int count = 0;

        // 약수 개수 세기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;

        // 약수 저장
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index++] = i;
            }
        }

    return answer;
    }
}