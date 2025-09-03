package cf5;
import java.util.*;
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			long[] arr=new long[n];
			for (int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for (int i=0;i<n;i++) {
				arr[i]+=k*(arr[i]%(k+1));
			}
			for(long a:arr)
				System.out.print(a+" ");
			System.out.println();
		}
	}
}
