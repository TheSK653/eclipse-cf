package cf2;
import java.util.*;
public class C {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt()-1;
            int[] arr=new int[n];
            for (int i=0;i<n;i++) {
            	arr[i]=sc.nextInt();
            }
            int h=arr[k];
            Arrays.sort(arr);
            k=0;
            while(k<n) {
            	if(arr[k]<=h) k++;
            	else {
            		k--;
            		break;
            	}
            }
            boolean f=true;
            while(k<n) {
            	if(arr[k]==arr[n-1]) break;
            	if(arr[k+1]-arr[k]<=h) {
            		k++;
            	}
            	else {
            		f=false;
            		break;
            	}
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
