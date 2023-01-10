import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = 0;
		int b= 0;
		
		for(int i = 0; i < 3; i++) {
			a = a * 10 + (A % 10);
			A /= 10;
			
			b = b * 10 + (B % 10);
			B /= 10;
		}
		if(a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}