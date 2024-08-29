import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int cnt = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        for(int i=max-min+1; i<max; i++) cnt++;
        int sum = sides[0] + sides[1];
        for(int i=max; i<sum; i++) cnt++;
        return cnt;
    }
}