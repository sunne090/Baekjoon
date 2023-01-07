import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();


        for(int i = 0; i < N; i++){
            arr.add(sc.next());
        }

        for(int i = 0; i < arr.size(); i++){
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j < arr.get(i).length(); j++){
                if(arr.get(i).charAt(j) == 'O'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}