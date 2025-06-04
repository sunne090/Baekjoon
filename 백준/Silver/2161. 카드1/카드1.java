import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        //1~N까지의 값을 순서대로 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        //queue에 값이 1개 남으면 끝
        while(queue.size() > 1) {
            System.out.print(queue.poll() + " "); //버린 카드 출력
            queue.offer(queue.poll()); //카드 옮기기
        }

        System.out.print(queue.poll()); //남는 카드 출력

    }
}
