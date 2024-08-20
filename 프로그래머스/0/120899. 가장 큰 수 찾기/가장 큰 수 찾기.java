import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int a : array) list.add(a);
        Arrays.sort(array);
        return new int[] {array[array.length-1], list.indexOf(array[array.length-1])};
    }
}