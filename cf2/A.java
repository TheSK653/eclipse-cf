package cf2;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	private static boolean canDestroyKForFree(int k, int c, int[] a) {
        if (k == 0) {
            return true;
        }

        for (int i = 0; i < k; i++) {
            int power = k - 1 - i;
            
            // For n<=30, power is at most 29. 1 << 29 fits in an int.
            int powerOfTwo = 1 << power;
            
            // The check a[i] * powerOfTwo > c could overflow.
            // Using division is safe from overflow.
            if (a[i] > c / powerOfTwo) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int low = 0;
            int high = n;
            int maxFreeBags = 0;

            while (low <= high) {
                int mid_k = low + (high - low) / 2;
                if (canDestroyKForFree(mid_k, c, a)) {
                    maxFreeBags = mid_k;
                    low = mid_k + 1;
                } else {
                    high = mid_k - 1;
                }
            }
            
            System.out.println(n - maxFreeBags);
        }
        sc.close();
    }
}