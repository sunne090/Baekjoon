class Solution {
    public String[] solution(String my_str, int n) {
       String[] answer = {};
        if(my_str.length()%n==0){
            answer = new String[my_str.length()/n];
        } else {
            answer = new String[my_str.length()/n+1];
        }
        for(int i = 0; i < my_str.length()/n; i++) {
            answer[i] = my_str.substring(n*i, n*(i+1)).toString();
        }
        if(my_str.length()%n != 0) {
            answer[my_str.length()/n] = my_str.substring(n*(my_str.length()/n), my_str.length());
        }
        return answer;
    }
}