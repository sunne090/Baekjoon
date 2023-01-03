import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int cycle = 0;
		int num = N;

		while(true) {
			
			int a = num/10;
			int b = num%10;
			
			sum = (a + b)%10;
			num = (b*10)+sum;
			cycle++;
			
			if(num == N) {
				break;
			}
		}
		System.out.println(cycle);
	}
}