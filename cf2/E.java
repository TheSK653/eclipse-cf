package cf2;

import java.util.*;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(minOperations(x, y, k));
        }

        sc.close();
    }

    static int minOperations(int x, int y, int k) {
        if (x == y) return 0;

        Set<Long> visited = new HashSet<>();
        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{x, 0});
        visited.add((long) x);

        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long value = current[0];
            int steps = (int) current[1];

            for (int a = 1; a <= k; a++) {
                long mul = value * a;
                if (mul == y) return steps + 1;
                if (mul <= 1_000_000 && visited.add(mul)) {
                    queue.add(new long[]{mul, steps + 1});
                }

                // x^a, only if result is not too large
                long pow = 1;
                boolean overflow = false;
                for (int i = 1; i <= a; i++) {
                    pow *= value;
                    if (pow > 1_000_000) {
                        overflow = true;
                        break;
                    }
                }
                if (!overflow && pow == y) return steps + 1;
                if (!overflow && visited.add(pow)) {
                    queue.add(new long[]{pow, steps + 1});
                }
            }
        }

        return -1;
    }
}
