package cf4;
import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for (int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			boolean f=true;
			for (int i=0;i<n-1;i++) {
				if(arr[i]==arr[i+1]) {
					System.out.println("YES");
					f=false;
					break;
				}
			}
			if(f) System.out.println("NO");
		}
	}
}
