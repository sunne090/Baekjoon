import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String s = br.readLine();
        int l = s.length();
        int result = 1;        

		char[] str = new char[l];
        for(int i = 0; i < s.length(); i++){
            str[i] = s.charAt(i);
        }
        for(int j = 0; j < str.length; j++){
            if(str[j] == str[l-1]){
                l--;
                continue;
            } else {
                result = 0;
                break;
            }
        }
        System.out.println(result);
	}
}