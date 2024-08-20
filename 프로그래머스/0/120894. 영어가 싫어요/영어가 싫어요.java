import java.util.*;

class Solution {
    public long solution(String numbers) {
        List<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        String temp = "";
        long answer = 0;
        for(char c : numbers.toCharArray()) {
            temp += c;
            if(list.contains(temp)) {
                answer = answer * 10 + list.indexOf(temp);
                temp = "";
            }
        }
        return answer;
    }
}