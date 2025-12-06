import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int oddNum = 1;
        int blankNum = N-1;
        for(int i = 1; i <= N; i++){ //상단 별찍기
            for(int j = blankNum; j > 0; j--){
                out.print(" ");
            }
            for(int j = 0; j < oddNum; j++){
                out.print("*");
            }
            oddNum=oddNum+2;
            blankNum--;
            out.println();
        }
        oddNum = 2*N-3;
        blankNum = 1;
        for(int i = 1; i <= N-1; i++){ //1~4
            for(int j = 0; j < blankNum; j++){
                out.print(" ");
            }
            for(int j = oddNum; j >= 1; j--){
                out.print("*");
            }
            oddNum=oddNum-2;
            blankNum++;
            out.println();
        }
    }
}
