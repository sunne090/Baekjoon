public class Main {
	public static void main(String[] args) {
		int[] SelfNumber = new int[10001];	// 셀프넘버를 넣을 배열 선언
		int count = 1;						// count 변수 -> 1씩 증가
		int Self = 0;						// 셀프넘버를 계산해 넣을 변수 선언
		int i = 0;							// 셀프넘버 계산을 위한 변수 선언

		// count가 10000보다 작을 때까지 반복
		while (count < 10000) {
			// 처음 시작은 count로 초기화
			Self = count;
			i = count;

			// 0이 될때까지 반복
			while (i != 0) {
				// i를 10으로 나눈 나머지를 계속 더해서 계산
				Self += i % 10;
				i /= 10;
			}

			// 10000보다 작은 것만 배열에 입력
			if (Self < 10000)
				SelfNumber[Self]++;

			// count증가
			count++;
		}

		// 10000보다 작은 셀프넘버를 출력
		for (int j = 1; j <= 9999; j++) {
			if (SelfNumber[j] == 0) {
				System.out.println(j);
			}
		}
	}
}