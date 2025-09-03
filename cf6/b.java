package cf6;
import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            if (hasKConsecutiveOnes(s, k)) {
                System.out.println("NO");
                continue;
            }

            List<Integer> ones = new ArrayList<>();
            List<Integer> zeros = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones.add(i);
                } else {
                    zeros.add(i);
                }
            }

            int[] p = new int[n];
            int x = 1;

            for (int i : ones) {
                p[i] = x++;
            }
            for (int i : zeros) {
                p[i] = x++;
            }

            System.out.println("YES");
            for (int y:p) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static boolean hasKConsecutiveOnes(String s, int k) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
                if (count >= k) return true;
            } else {
                count = 0;
            }
        }
        return false;
    }
}