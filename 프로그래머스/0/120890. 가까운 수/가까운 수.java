import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> list = new ArrayList<>();
        for(int a : array) list.add(a);
        list.add(n);
        Collections.sort(list);
        int idx = list.indexOf(n);
        if(idx == 0) return list.get(idx+1);
        if(list.indexOf(n) < array.length)
            return n-list.get(idx-1) <= list.get(idx+1)-n ? list.get(idx-1) : list.get(idx+1);
        else return list.get(idx-1);
    }
}