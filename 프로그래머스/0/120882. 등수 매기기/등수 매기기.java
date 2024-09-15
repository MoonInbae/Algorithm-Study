import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        int[] avg = new int[score.length];
        for(int i=0; i<score.length; i++) {
            avg[i] = score[i][0] + score[i][1];
            list.add(avg[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++) answer[i] = list.indexOf(avg[i])+1;
        return answer;
    }
}