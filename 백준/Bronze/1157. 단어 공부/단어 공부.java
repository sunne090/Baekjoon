import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next().toUpperCase();
      int[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
      int[] count = new int[26];
      int cnt = 0;
      
      for(int i = 0; i < s.length(); i++) {
         for(int j = 0; j < alphabet.length; j++) {
            if((int)s.charAt(i) == alphabet[j]) {
            	count[j] += 1;
               break;
            }
         }
      }
      int max = count[0];
      int m = alphabet[0];
      for(int i =0; i <count.length; i++) {
         if(count[i] > max) {
        	 max = count[i];
        	 m = alphabet[i];
         }
      }
      for(int i:count) {
    	  if(i == max) {
    		  cnt++;
    	  }
      }
      if(cnt > 1) {
    	  System.out.println("?");
      } else {
    	  System.out.println((char)m);
      }
      
   }
}