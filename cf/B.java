package cf;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // consume newline

        while (t-- > 0) {
            String s = sc.nextLine();

            boolean allWrapped = true;
            int balance = 0;

            // Check if the entire string is one big wrapped block like (A)
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '(') balance++;
                else balance--;

                if (balance == 0 && i != s.length() - 1) {
                    allWrapped = false;
                    break;
                }
            }

            if (allWrapped) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
