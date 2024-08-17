import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                      "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                      "...-",".--","-..-","-.--","--.."};
        Map<String, Character> map = new HashMap<>();
        for(int i=0; i<m.length; i++) map.put(m[i], (char)(i+'a'));
        String[] s = letter.split(" ");
        for(String a : s) answer += map.get(a);
        return answer;
    }
}