import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int answer = Integer.parseInt(s[0])-Integer.parseInt(s[1]);
        System.out.println(answer);
    }
}