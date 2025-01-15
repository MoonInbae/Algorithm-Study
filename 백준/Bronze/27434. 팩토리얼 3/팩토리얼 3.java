import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(factorial(1, n));
    }
 
    private static BigInteger factorial(int start, int end) {
        if(start == end) return BigInteger.valueOf(end);
        return factorial(start, (start + end) / 2).multiply(factorial((start + end) / 2 + 1, end));
    }
}