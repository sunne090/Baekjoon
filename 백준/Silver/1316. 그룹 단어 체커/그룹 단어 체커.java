import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;


        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            Set<Character> set = new HashSet<>();
            char prev = 0;
            boolean isGroup = true;
            for(int j = 0; j < str.length(); j++) {
                char curr = str.charAt(j);
                if(prev != curr) { //이전문자 != 현재문자(연속된 문자는 허용함)
                    if(set.contains(curr)) {
                        isGroup = false;
                        break;
                    } else {
                        set.add(curr);
                    }
                    prev = curr;
                }
            }
            if(isGroup) {
                count++;
            }
        }
        System.out.println(count);
    }
}