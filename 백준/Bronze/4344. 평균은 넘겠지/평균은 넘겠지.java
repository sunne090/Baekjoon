import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        double total = 0.0;
        double avg = 0.0;
        double sum = 0.0;

        for(int i = 0; i < C; i++){
            int N = sc.nextInt();
            int[] score = new int[N];
            for(int j = 0; j < N; j++){
                score[j] = sc.nextInt();
                total += score[j];
            }
            avg = total / N;
            total = 0;
            for(int j:score){
                if(j > avg){
                    sum++;
                }
            }
            System.out.println(String.format("%.3f",(sum/N)*100)+"%");
            sum = 0;
        }
    }
}