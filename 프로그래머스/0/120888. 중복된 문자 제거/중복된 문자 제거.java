import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<String> list = new ArrayList<>();
        String answer = "";
        for(String s : my_string.split("")) {
            if(!list.contains(s)) {
                list.add(s);
                answer += s;
            }
        }
        return answer;
    }
}