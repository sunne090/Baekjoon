import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int total = 0;
       for(int i = 0; i < 5; i++) {
    	   int score = sc.nextInt();
    	   if(score < 40) {
    		   score = 40;
    	   }
    	   total += score;
       }
       System.out.println(total/5);
    }
}