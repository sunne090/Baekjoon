import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int room = 1;
		int count = 1;
		while(true) {
			if(N > room ) {
				room = room + (6*count);
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}