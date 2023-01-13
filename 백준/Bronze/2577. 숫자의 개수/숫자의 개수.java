import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();

       int totalNum = A * B * C;
       String s = Integer.toString(totalNum);
       String[] s1 = s.split("");

       int[] intArray = new int[10];
       for (int i = 0; i < intArray.length; i++) {
           intArray[i] = i;
       }

       for (int i = 0; i < intArray.length; i++) {
           for (int j = 0; j < s1.length; j++) {
               if (i == Integer.parseInt(s1[j]))  { 
                   intArray[i] = intArray[i] + 1;
               }
           }
       }

       for (int i = 0; i < intArray.length; i++) {
           System.out.println((intArray[i] - i));
       }
    }
}