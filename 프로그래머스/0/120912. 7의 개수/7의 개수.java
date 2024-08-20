class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        for(int n : array) {
            while(n%10 > 0) {
                if(n%10 == 7) cnt++;
                n/=10;
            }
        }
        return cnt;
    }
}