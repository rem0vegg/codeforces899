import java.util.Scanner;
import java.util.ArrayList;

public class problemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        ArrayList<Long> a = new ArrayList<>((int) n);
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextLong());
        }

        long ans = 0;

        if (n == 1) {
            if (a.get(0) <= 0) {
                System.out.println(0);
            } else {
                System.out.println(a.get(0));
            }
        }

        if (a.get(0) >= 0 || a.get(1) <= 0) {
            for (int i = 0; i < n; i++) {
                ans += Long.max(0L, a.get(i));
            }

            System.out.println(ans);
        }

        for (int i = 2; i < n; i++) {
            ans += Long.max(0L, a.get(i));
        }

        ans += Long.max(0L, a.get(0) + a.get(1));

        System.out.println(ans);
    }
}