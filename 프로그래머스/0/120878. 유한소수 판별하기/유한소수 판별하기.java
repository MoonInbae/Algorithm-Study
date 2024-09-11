import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int min = Math.min(a,b);
        for(int i=2; i<=min; i++) {
            while(a%i==0 && b%i==0) {
                a/=i;
                b/=i;
            }
        }
        for(int i=2; i<=b; i++) {
            while(b%i==0) {
                if(i!=2 && i!=5) return 2;
                b/=i;
            }
        }
        return 1;
    }
}