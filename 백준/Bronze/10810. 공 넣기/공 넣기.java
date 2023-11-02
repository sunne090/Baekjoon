import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] intArray = new int[N]; //N개의 바구니

        for(int b = 0; b < M; b++){
            int i = sc.nextInt(); //시작 바구니
            int j = sc.nextInt(); //끝 바구니
            int k = sc.nextInt(); //넣을 공 번호

            for(int c = 0; c <= (j-i) ; i++) {
                intArray[i-1] = k;
            }
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
    }
}
   