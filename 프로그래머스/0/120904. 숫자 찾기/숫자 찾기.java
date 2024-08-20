import java.util.*;

class Solution {
    public int solution(int num, int k) {
        List<Integer> list = new ArrayList<>();
        while(num/10 > 0) {
            list.add(0, num % 10);
            num /= 10;
        }
        list.add(0, num);
        return list.contains(k) ? list.indexOf(k)+1 : -1;
    }
}