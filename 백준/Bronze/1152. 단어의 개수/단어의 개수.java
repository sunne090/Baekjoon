import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        StringTokenizer str = new StringTokenizer(st, " ");
        System.out.println(str.countTokens());
    }
}