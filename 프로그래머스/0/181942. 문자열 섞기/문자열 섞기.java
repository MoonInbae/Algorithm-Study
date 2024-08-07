import java.util.*;
class Solution {
    public String solution(String str1, String str2) {
        StringBuilder b = new StringBuilder();
        for(int i=0; i<str1.length(); i++) {
            b.append(str1.charAt(i));
            b.append(str2.charAt(i));
        }
        return b.toString();
    }
}