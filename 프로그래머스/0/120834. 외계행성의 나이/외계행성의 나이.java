import java.util.ArrayList;
class Solution {
    public String solution(int age) {
        char[] list = new char[10];
        String answer = "";
        String temp = "";
        ArrayList<Integer> arrNum = new ArrayList<>();
        int j = 97;
        for(int i = 0; i < list.length; i++){
            list[i] = (char) j;
            j++;
        }
        while(age > 0){
            arrNum.add(age % 10);
            age /= 10;
        }
        for(int i = 0; i < arrNum.size(); i++){
            temp += list[arrNum.get(i)];
        }
        StringBuffer sb = new StringBuffer(temp);
        answer = sb.reverse().toString();

        return answer;
    }
}