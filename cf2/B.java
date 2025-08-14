package cf2;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++) {
            	arr[i]=sc.nextInt();
            }
            int c=0;
            int j=0;
            while(j<n) {
            	int x=0;
            	while(j<n && arr[j]==0) {
            		j++;
            		x++;
	            	if (x==k) {
	            		c++;
	            		break;
	            	}
            	}
            	j++;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
