class Solution {
    public int solution(int n) {
        int i = 1;
        for(i=1; i<=10; i++)
            if((n /= i) < i+1) return i;
        return i-1;
    }
}