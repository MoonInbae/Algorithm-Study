import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int min = Math.min(x,y);
		long answer = 0;

		if(c<(a+b)/2) answer = c*2*min;
		else answer = (a+b)*min;

		if(x==min) answer += Math.min(b*(y-min),c*2*(y-min));
		else answer += Math.min(a*(x-min),c*2*(x-min));

		System.out.println(answer);
		sc.close();
	}
}