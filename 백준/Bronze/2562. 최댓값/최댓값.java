import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count = 0;
		
		for(int i = 0; i < 9; i++) {
			arr.add(sc.nextInt());
		}
		int max = arr.get(0);
		
		for(int j:arr) {
			if(max < j) {
				max = j;
			}
		}
		for(int k = 0; k < 9; k++) {
			if(arr.get(k) == max) {
				count = k+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
