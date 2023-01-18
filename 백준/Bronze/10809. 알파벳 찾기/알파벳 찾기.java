import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      int[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      int[] count = new int[26];
      
      for(int i = 0; i < s.length(); i++) {
         for(int j = 0; j < alphabet.length; j++) {
            if((int)s.charAt(i) == alphabet[j]) {
            	alphabet[j] = i;
            	count[j] += 1;
               break;
            }
         }
      }
      
      for(int i = 0; i < alphabet.length; i++) {
    	  if(count[i] == 0) {
    		  alphabet[i] = -1;
    	  }
      }
      for(int i:alphabet) {
         System.out.print(i+" ");
      }
   }
}