import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int total = 0;
		
		if(A==B && B==C) {
			total = 10000 + A*1000;
		} else if(A==B || B==C || A==C) {
			if(A==B || A==C) {
				total = 1000+A*100;
			} else if(B==C) {
				total = 1000+B*100;
			}
		} else {
			int max;
			if(A > B) {
				max = A;
			} else {
				max = B;
			}
			if(C > max) {
				max = C;
			}
			
			total = max*100;
		}
		
		System.out.println(total);
	}
}