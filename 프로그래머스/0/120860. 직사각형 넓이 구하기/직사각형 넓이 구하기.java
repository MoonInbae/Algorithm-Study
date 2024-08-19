import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for(int[] dot : dots) {
            xList.add(dot[0]);
            yList.add(dot[1]);
        }
        int width = Collections.max(xList) - Collections.min(xList);
        int length = Collections.max(yList) - Collections.min(yList);
        return width * length;
    }
}