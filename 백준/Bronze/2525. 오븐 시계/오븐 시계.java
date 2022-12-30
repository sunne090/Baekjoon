import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int cook = sc.nextInt();
		
		int hour;
		int minute;
		
		if(M+cook >= 60) {
			minute = (M+cook)%60;
			hour = H+((M+cook)/60);
			if(hour >= 24) {
				hour = hour-24;
			}
		} else {
			hour= H;
			minute = M + cook;
		}
		System.out.println(hour+" "+minute);
		
	}
}