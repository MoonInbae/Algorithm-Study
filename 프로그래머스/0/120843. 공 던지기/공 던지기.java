class Solution {
    public int solution(int[] numbers, int k) {
        return numbers[(numbers.length-1)%(k+1)];
    }
}