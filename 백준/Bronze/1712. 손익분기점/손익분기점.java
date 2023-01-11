import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int count = 0;
        if(B >= C){
            count = -1;
        } else {
            count = (A / (C - B)) + 1;
        }
        System.out.print(count);
    }
}