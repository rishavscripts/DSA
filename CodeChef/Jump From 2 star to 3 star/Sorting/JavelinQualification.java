import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavelinQualification {
    static Scanner sc = new Scanner(System.in);

    static class Player {
        int id;
        int distance;

        Player(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            ArrayList<Integer> qualified = new ArrayList<>();
            ArrayList<Player> remaining = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] >= m) {
                    qualified.add(i + 1);
                } else {
                    remaining.add(new Player(i + 1, a[i]));
                }
            }

            int need = x - qualified.size();

            if (need > 0) {

                remaining.sort((p1, p2) -> p2.distance - p1.distance);

                for (int i = 0; i < need; i++) {
                    qualified.add(remaining.get(i).id);
                }
            }

            Collections.sort(qualified);

            System.out.print(qualified.size());

            for (int id : qualified) {
                System.out.print(" " + id);
            }

            System.out.println();
        }
    }
}
