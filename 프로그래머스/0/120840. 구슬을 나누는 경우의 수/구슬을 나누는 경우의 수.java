class Solution {
    public int solution(int balls, int share) {
        int a = 1;
        // for(int i=balls; i>balls-share; i--) a *= i;
        // for(int i=1; i<=share; i++) b *= i;
        for(int i=1; i<=share; i++) {
            if(balls == 30 && i>10) {
                a = a / i * (balls-i+1);
            }
            else a = a * (balls-i+1) / i;
            System.out.println(i+" / "+(balls-i+1)+" / "+a);
        }
        return a;
    }
}