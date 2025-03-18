class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            int a = Integer.parseInt(quiz[i].split(" ")[0]);
            int b = Integer.parseInt(quiz[i].split(" ")[2]);
            if(quiz[i].split(" ")[1].equals("-")){
                if(a-b == Integer.parseInt(quiz[i].split(" ")[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if(quiz[i].split(" ")[1].equals("+")){
                if(a+b == Integer.parseInt(quiz[i].split(" ")[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}