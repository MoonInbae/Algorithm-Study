class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char c : my_string.toCharArray())
            answer += Character.toString(c).repeat(n);
        return answer;
    }
}