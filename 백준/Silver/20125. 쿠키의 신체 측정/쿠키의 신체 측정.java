import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[][] map = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int heartRow = 0;
        int heartCol = 0;

        // 1. 머리를 이용해 심장 위치 찾기
        //머리는 첫번째 * (첫번째 *을 찾으면 그 아래에 바로 심장)
        //(row,col) => row+1,col
        outer: for (int i = 0; i < N; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '*') {
                    heartRow = i + 1;
                    heartCol = j;
                    break outer;
                }
            }
        }

        System.out.printf("%d %d\n", heartRow + 1, heartCol + 1);

        // 2. 팔 길이 (머리 줄에서 좌우로)
        int leftArm = 0;
        for (int j = heartCol - 1; j >= 0; j--) {
            if (map[heartRow][j] == '*') leftArm++;
            else break;
        }

        int rightArm = 0;
        for (int j = heartCol + 1; j < N; j++) {
            if (map[heartRow][j] == '*') rightArm++;
            else break;
        }

        // 3. 허리 길이 (심장 아래로)
        int waist = 0, waistEndRow = heartRow;
        for (int i = heartRow + 1; i < N; i++) {
            if (map[i][heartCol] == '*') {
                waist++;
                waistEndRow = i;
            } else break;
        }

        // 4. 다리 길이 (허리 끝 기준 좌우 대각선 아래)
        int leftLeg = 0;
        for (int i = waistEndRow + 1; i < N; i++) {
            if (map[i][heartCol - 1] == '*') leftLeg++;
            else break;
        }

        int rightLeg = 0;
        for (int i = waistEndRow + 1; i < N; i++) {
            if (map[i][heartCol + 1] == '*') rightLeg++;
            else break;
        }

        System.out.printf("%d %d %d %d %d\n", leftArm, rightArm, waist, leftLeg, rightLeg);
    }
}