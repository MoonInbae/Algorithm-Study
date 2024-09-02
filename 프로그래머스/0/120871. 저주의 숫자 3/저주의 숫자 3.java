class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while(cnt<n) {
            if(i%3==0 && i%10%3==0 && i%100/10%3==0 && i/100%3==0) answer++;
            answer++;
        }
    }
}