import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //바구니 갯수
        int M = sc.nextInt(); //공 바꿀 횟수

        int[] intArray = new int[N]; //N개의 바구니
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i+1;
        }

        for(int a = 0; a < M; a++){
            int i = sc.nextInt(); //시작 바구니
            int j = sc.nextInt(); //끝 바구니
            int[] newArray = new int[j-i+1];
            int b = j-1;
            if(i == j) {
                continue;
            } else {      
                //시작바구니 ~ 끝 바구니 갯수크기의 배열 선언
                for(int k = 0; k <newArray.length; k++){
                    newArray[k] = intArray[b];
                    b--;
                }
                for(int c = 0; c < newArray.length; c++){
                    intArray[i-1] = newArray[c];
                    i++;
                }
            }
        } 
        for(int d=0; d< intArray.length;d++){
            System.out.print(intArray[d]+" ");
        }    
    }
}
    
