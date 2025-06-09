import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] person = new int[n][2]; //weight, height
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            person[i][0] = sc.nextInt(); //weight
            person[i][1] = sc.nextInt(); //height
            rank[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) { //키랑 몸무게가 둘 다 작은 경우
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }

        sc.close();
    }
}