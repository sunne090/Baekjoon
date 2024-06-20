class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letterArr = letter.split(" ");

        for(int i=0;i<letterArr.length;i++){
            if (letterArr[i].equals(".-")) answer += "a";
            if (letterArr[i].equals("-...")) answer += "b";
            if (letterArr[i].equals("-.-.")) answer += "c";
            if (letterArr[i].equals("-..")) answer += "d";
            if (letterArr[i].equals(".")) answer += "e";
            if (letterArr[i].equals("..-.")) answer += "f";
            if (letterArr[i].equals("--.")) answer += "g";
            if (letterArr[i].equals("....")) answer += "h";
            if (letterArr[i].equals("..")) answer += "i";
            if (letterArr[i].equals(".---")) answer += "j";
            if (letterArr[i].equals("-.-")) answer += "k";
            if (letterArr[i].equals(".-..")) answer += "l";
            if (letterArr[i].equals("--")) answer += "m";
            if (letterArr[i].equals("-.")) answer += "n";
            if (letterArr[i].equals("---")) answer += "o";
            if (letterArr[i].equals(".--.")) answer += "p";
            if (letterArr[i].equals("--.-")) answer += "q";
            if (letterArr[i].equals(".-.")) answer += "r";
            if (letterArr[i].equals("...")) answer += "s";
            if (letterArr[i].equals("-")) answer += "t";
            if (letterArr[i].equals("..-")) answer += "u";
            if (letterArr[i].equals("...-")) answer += "v";
            if (letterArr[i].equals(".--")) answer += "w";
            if (letterArr[i].equals("-..-")) answer += "x";
            if (letterArr[i].equals("-.--")) answer += "y";
            if (letterArr[i].equals("--..")) answer += "z";
        }
        return answer;
    }
}