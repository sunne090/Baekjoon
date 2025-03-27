import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 65 && a.charAt(i) <= 90){
                answer+=(char)(a.charAt(i)+32);
            } else if(a.charAt(i) >= 97 && a.charAt(i) <= 122){
                answer+=(char)(a.charAt(i)-32);
            }
        }
        System.out.println(answer);
    }
}