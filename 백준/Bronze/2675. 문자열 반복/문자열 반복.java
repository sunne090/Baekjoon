import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = 0;
        String S = " ";
        for(int i = 0; i < T; i++){
            R = sc.nextInt();
            S = sc.next();

            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.print("\n");
        }
    }
}