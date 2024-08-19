import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        int width = 0;
        int length = 0;
        for(int[] dot : dots) {
            xList.add(dot[0]);
            yList.add(dot[1]);
        }
        width = Collections.max(xList) - Collections.min(xList);
        length = Collections.max(yList) - Collections.min(yList);
        return width * length;
    }
}