import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		
		int V = sc.nextInt();
		
		for(int j:arr) {
			if(j==V) {
				total++;
			}
		}
		
		System.out.println(total);
	}
}