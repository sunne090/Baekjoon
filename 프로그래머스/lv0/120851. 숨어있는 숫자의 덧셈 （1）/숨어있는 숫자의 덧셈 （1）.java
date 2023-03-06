class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(!(65 <= my_string.charAt(i) && (my_string.charAt(i) <= 122))) {
            	answer+= Character.getNumericValue(my_string.charAt(i));
            }
        }
        return answer;
    }
}