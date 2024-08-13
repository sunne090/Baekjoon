class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals("Z")){
                answer += Integer.parseInt(strArr[i]);
            } else{
                answer -= Integer.parseInt(strArr[i-1]);
            }
        }
        return answer;
    }
}