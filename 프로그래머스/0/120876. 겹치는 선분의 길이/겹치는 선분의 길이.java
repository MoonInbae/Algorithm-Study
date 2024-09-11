import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int[] entire = new int[200];
        int answer = 0;
        for(int[] line : lines)
            for(int i=line[0]+100; i<line[1]+100; i++) entire[i]++;
        for(int i=0; i<entire.length; i++)
            if(entire[i] > 1) answer++;
        return answer;
    }
}