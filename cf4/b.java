package cf4;
import java.util.*;
public class b {

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
			long e=0;
			for(int i=n-1;i>=0;i-=2) {
				e+=arr[i];
			}
			System.out.println(e);
		}
	}

}
