class Solution {
    public int solution(int n) {
        if (n % 2 != 0) {
            return (int) Math.pow((n + 1) / 2, 2);
        } else {
            return 2 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 3;
        }
    }
}