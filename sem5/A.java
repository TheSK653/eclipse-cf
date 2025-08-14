package sem5;
import java.util.*; 
public class A {
    static void cal(Scanner sc) {
        long x = sc.nextLong();
        int z = 63 - Long.numberOfLeadingZeros(x);
        long ans = 2L * z + 3;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i)	cal(sc);
        sc.close();
    }
}