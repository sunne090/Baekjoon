import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			arr.add(sc.nextInt()%42);
		}
		
		arr2.add(arr.get(0));
		
		for(int j:arr) {
			if(!arr2.contains(j)) {
				arr2.add(j);
			}
		}
		
		System.out.println(arr2.size());
	}
}