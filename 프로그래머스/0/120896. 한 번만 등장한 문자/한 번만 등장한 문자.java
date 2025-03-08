import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
         ArrayList<Character> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            int num = 0;
            for(int j = 0; j < s.length(); j++) {
                if(list.get(i) == s.charAt(j)){
                    num++;
                }
            }
            list2.add(num);
        }

        for(int i = 0; i < list.size(); i++) {
            if(list2.get(i) == 1){
                answer += String.valueOf(list.get(i));
            }
        }
        return answer;
    }
}