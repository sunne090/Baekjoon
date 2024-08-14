class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            //answer이 my_string의 i번째 글자를 포함하고 있지 않으면
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                //answer에 my_string의 i번째 글자를 추가한다.
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}