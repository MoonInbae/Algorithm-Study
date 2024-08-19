// class Solution {
//     public int solution(int n) {
//         int i = 1;
//         for(i=1; i<=10; i++) {
//             if((n /= i) == 1) return i;
//         }
//         return i-2;
//     }
// }
public class Solution {
    public int solution(int n) {
        int factorial = 1;
        int i = 1;
        
        // i!이 n보다 작거나 같은 최대의 i를 찾기 위해 for문을 사용합니다.
        for (i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial > n) {
                break;
            }
        }
        
        // for문에서 i가 증가된 상태로 나오므로 1을 빼줍니다.
        return i - 1;
    }
}