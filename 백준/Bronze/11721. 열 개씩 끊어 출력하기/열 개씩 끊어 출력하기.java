import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String a = br.readLine();
       
       for(int i = 0; i < a.length(); i++) {
    	   System.out.print(a.charAt(i));
    	   if(i % 10 == 9) {
    		   System.out.println();
    	   }
       }
    }
}