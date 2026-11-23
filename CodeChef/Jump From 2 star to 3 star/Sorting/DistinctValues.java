import java.util.HashSet;
import java.util.Scanner;

public class DistinctValues {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        HashSet<Long> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextLong());
        }

        System.out.println(2);
        System.out.println(set.size());
    }
}
