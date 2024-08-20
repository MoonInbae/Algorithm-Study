class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        for(int a : array)
            if(n == a) cnt++;
        return cnt;
    }
}