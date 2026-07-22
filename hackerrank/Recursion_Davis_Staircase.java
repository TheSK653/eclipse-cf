import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Recursion_Davis_Staircase {

    /*
     * Complete the 'stepPerms' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int stepPerms(int n) {
    // Write your code here
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        
        // Iterative sliding window to optimize space to O(1)
        long a = 1; // ways for n-3
        long b = 2; // ways for n-2
        long c = 4; // ways for n-1
        long current = 0;
        long mod=10000000007L;
        
        for (int i = 4; i <= n; i++) {
            current = (a + b + c) % mod;
            a = b;
            b = c;
            c = current;
        }
        
        return (int) current;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, s).forEach(sItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int res = Result.stepPerms(n);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
