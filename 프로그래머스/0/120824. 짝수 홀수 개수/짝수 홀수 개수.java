class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        int temp = 0;
        for(int a : num_list)
            temp = (a%2==0) ? even++ : odd++;
        return new int[]{even, odd};
    }
}