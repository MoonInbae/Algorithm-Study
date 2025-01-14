import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            total -= sc.nextInt()*sc.nextInt();
        }
        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
	    sc.close();
    }
}