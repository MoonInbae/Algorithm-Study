import java.util.*;

class Solution {
    public int solution(int n) {
        int temp = 1;
        int pieces = 6;
        for(int i=Math.min(n, pieces); i>0; i--)
            if(n%i==0 && pieces%i==0) {
                temp *= i;
                n /= i;
                pieces /= i;
            }
        return temp * n * pieces / 6;
    }
}