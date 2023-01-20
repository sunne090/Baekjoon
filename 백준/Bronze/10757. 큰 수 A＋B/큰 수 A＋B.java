import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Anum = sc.next();
        String Bnum = sc.next();
        BigInteger A = new BigInteger(Anum);
        BigInteger B = new BigInteger(Bnum);
        System.out.println(A.add(B));
    }
}