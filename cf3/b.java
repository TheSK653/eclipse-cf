	package cf3;
import java.util.*;
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			int m=1;
			int c=0;
			Stack<Long> st=new Stack<>();
			long x;
			do {
				x=((long) Math.pow(10,m)+1);
				if(n%x==0) {
					st.push(n/x);
					c++;
				}
				m++;
			} while(n/x>0);
			System.out.println(c);
			while(!st.isEmpty()) {
				System.out.print(st.pop()+" ");
			}
			if(c>0) {
				System.out.println();
			}
		}
	}

}
