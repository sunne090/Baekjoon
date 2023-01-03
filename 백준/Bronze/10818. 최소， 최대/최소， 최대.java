import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int j:arr) {
			if(j<=min) {
				min = j;
			}
			if(j>max) {
				max = j;
			}
		}
		System.out.println(min+" "+max);
	}
}