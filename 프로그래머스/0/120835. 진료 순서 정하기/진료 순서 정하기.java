import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] wrapperArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(wrapperArr, Collections.reverseOrder());
        List<Integer> list = new ArrayList<>(Arrays.asList(wrapperArr));
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++)
            answer[i] = list.indexOf(emergency[i])+1;
        return answer;
    }
}