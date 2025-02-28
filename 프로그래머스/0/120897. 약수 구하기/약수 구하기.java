import java.util.ArrayList;
import java.util.List;

class Solution {
    //어떤 수 n의 약수 (a, b)는 항상 a * b = n을 만족.
    //즉, 한쪽 약수가 √N 이하이면, 다른 쪽 약수는 √N 이상이므로 반만 검사하면 됨!
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        list.sort(null);  // 오름차순 정렬
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}