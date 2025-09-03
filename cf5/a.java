package cf5;
import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			if((n-Math.max(a, b))%2==0) {
				if (b>=a)
				System.out.println("YES");
				else {
					if((a-b)%2==0) {
						System.out.println("YES");
					}
					else
						System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
