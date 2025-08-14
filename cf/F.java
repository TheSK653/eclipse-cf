package cf;

import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			int z=0;
			System.out.print("0 ");
			while(--n>0) {
				int y=sc.nextInt();
				z=Math.max(z,(x%y+y%x));
				System.out.print(z+" ");
				x=Math.max(x, y);
			}
			System.out.println();
		}

	}

}
