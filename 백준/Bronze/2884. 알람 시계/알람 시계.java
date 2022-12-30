import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
	
		int hour;
		int minute;
		
		if (M-45 < 0) {
			if(H == 0) {
				hour = 24 - 1;
			} else {
				hour = H - 1;
			}
			minute = 60+(M-45);
		} else {
			hour = H;
			minute = M-45;
		}
		System.out.println(hour+" "+minute);
	}
}