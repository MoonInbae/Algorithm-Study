class Solution {
    public int solution(int n, int k) {
        return n/10>0 ? n*12000 + (k-n/10)*2000 : n*12000 + k*2000;
    }
}