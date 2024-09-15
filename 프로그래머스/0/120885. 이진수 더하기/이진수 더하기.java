class Solution {
    public String solution(String bin1, String bin2) {
        int sum = 0;
        sum += Integer.parseInt(bin1, 2);
        sum += Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(sum);
    }
}