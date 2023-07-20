import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i = 0; i < N; i++) {
    		String s = sc.next();
    		int end = s.length()-1;
    		System.out.print(s.charAt(0));
    		System.out.println(s.charAt(end));
    	}
    }
}