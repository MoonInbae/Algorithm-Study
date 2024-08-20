import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        int cnt = 0;
        String temp = "";
        for(int i=0; i<arr.length; i++) {
            if(!temp.equals(arr[i])) {
                if(cnt == 1) answer += temp;
                cnt = 0;
            }
            temp = arr[i];
            cnt++;
        }
        if(cnt == 1) answer += temp;
        return answer;
    }
}