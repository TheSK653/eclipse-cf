package cf6;
import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int r1=sc.nextInt();
			int k1=sc.nextInt();
			int r2=sc.nextInt()-r1;
			int k2=sc.nextInt()-k1;
			if ((Math.max(r1,k1)-2)<=Math.min(r1, k1)*2 && (Math.max(r2,k2)-2)<=Math.min(r2, k2)*2)
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
