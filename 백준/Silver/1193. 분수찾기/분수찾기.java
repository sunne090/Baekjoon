import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int line = 1;
        while (X > line) {
            X -= line;
            line++;
        }

        int numerator; //분자
        int denominator; //분모

        if (line % 2 == 0) {
            numerator = X;
            denominator = line - X + 1;
        } else {
            numerator = line - X + 1;
            denominator = X;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
