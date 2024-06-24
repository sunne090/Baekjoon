import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        if(balls == share){
            answer = 1;
        }else {
            answer = Integer.parseInt(String.valueOf(factorial(balls).divide(factorial(balls - share).multiply(factorial(share)))));
        }
        return answer;
    }

    static BigInteger factorial(int num){
        if(num == 1){
            return BigInteger.ONE;
        }
        return  BigInteger.valueOf(num).multiply(factorial(num-1));
    }
}