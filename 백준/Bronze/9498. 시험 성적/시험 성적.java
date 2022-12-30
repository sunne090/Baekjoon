import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if(90 <= A && A <= 100) {
			System.out.println("A");
		} else if(80 <= A && A <= 89) {
			System.out.println("B");
		} else if(70 <= A && A <= 79) {
			System.out.println("C");
		}else if(60 <= A && A <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
