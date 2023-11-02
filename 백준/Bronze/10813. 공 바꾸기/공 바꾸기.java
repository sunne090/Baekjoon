import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] intArray = new int[N]; //N개의 바구니
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i+1;
        }

        for(int a = 0; a < M; a++){
            int i = sc.nextInt(); //시작 바구니
            int j = sc.nextInt(); //끝 바구니

            int b = intArray[i-1];
            int c = intArray[j-1];

            intArray[i-1] = c;
            intArray[j-1] = b;

        }
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
    }
}