import java.util.Scanner;
import java.util.ArrayList;

public class problemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        ArrayList<Integer> b = new ArrayList<>();
        int x = 1;

        for (int i = 0; i < n; i++) {
            while (a.get(i) == x) {
                x++;
            }

            b.add(x);
            x++;
        }

        System.out.println(b.get(b.size() - 1));
    }
}