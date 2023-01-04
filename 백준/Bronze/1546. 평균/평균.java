import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] score = new double[N];
		
		for(int i=0;i<N;i++) {
			score[i] = sc.nextInt();
		}
		
		double max = score[0];
		double avg = 0;
		
		for(double j:score) {
			if(max < j) {
				max = j;
			}
		}
		for(int k=0;k<score.length;k++) {
			score[k] = score[k]/max*100;
			avg = avg + score[k];
		}
		
		System.out.println(avg/N);
	}
}