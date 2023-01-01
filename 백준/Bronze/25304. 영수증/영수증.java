import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // 영수증 총 금액
		int N = sc.nextInt(); // 영수즈에 적힌 구매한 물건의 종류 수
		int sum = 0;

		for(int i = 0; i < N; i++) {
			int a = sc.nextInt(); // 각 물건의 가격
			int b = sc.nextInt(); // 각 물건의 개수
			
			sum = sum + (a*b);
		}
		
		if(X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}