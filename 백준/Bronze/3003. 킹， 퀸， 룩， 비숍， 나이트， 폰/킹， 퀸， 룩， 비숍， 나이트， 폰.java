import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rooks = sc.nextInt();
		int bishops = sc.nextInt();
		int knights = sc.nextInt();
		int pawns = sc.nextInt();
		
		System.out.print(1-king+" ");
		System.out.print(1-queen+" ");
		System.out.print(2-rooks+" ");
		System.out.print(2-bishops+" ");
		System.out.print(2-knights+" ");
		System.out.print(8-pawns);
	}
}
