import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        for(int i=2; i*i<=n; i++) {
            while(n%i == 0) {
                n /= i;
                answer.add(i);
            }
        }
        if(n > 1) answer.add(n);
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}