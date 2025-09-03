	package cf3;
import java.util.*;
public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long c=0;
			while(n>0) {
				int x=0;
				while(n/Math.pow(3,x)>=3) {
					x++;
				}
				n-=Math.pow(3, x);
				c+=Math.pow(3, x+1)+x*Math.pow(3, x-1);
			}
			System.out.println(c);
		}
	}

}
