import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(char c : a.toCharArray()) {
            System.out.print(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
    }
}