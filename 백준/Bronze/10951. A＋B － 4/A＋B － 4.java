import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();

		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			arr.add(A+B);
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
}