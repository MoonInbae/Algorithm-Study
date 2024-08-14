import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int max = array[array.length-1];
        int[] cnt = new int[max+1];
        for(int i=0; i<array.length; i++) cnt[array[i]] ++;
        int top = 0;
        int answer = 0;
        for(int j=0; j<cnt.length; j++) {
            if(top == cnt[j]) answer = -1;
            else if(top < cnt[j]) {
                top = cnt[j];
                answer = j;
            }
        }
        return answer;
    }
}