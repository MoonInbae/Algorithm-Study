class Solution {
    public String solution(String my_string) {
        String a = "";
        for(char c : my_string.toCharArray())
            a = c+a;
        return a;
    }
}