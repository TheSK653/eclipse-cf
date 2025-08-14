package cf2;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[][] arr = new int[n][4];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < 3; j++)
                    arr[i][j] = sc.nextInt();

            boolean swap=true;
            while (swap) {
                swap = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i][3]==0 && arr[i][0] <= k && k <= arr[i][1]) {
                        k = Math.max(k,arr[i][2]);
                        arr[i][3]=1;
                        swap = true;
                    }
                }
            }
            System.out.println(k);
        }

        sc.close();
    }
}
