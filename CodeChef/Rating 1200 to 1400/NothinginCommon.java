import  java.util.*;
public class NothinginCommon {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> set1 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set1.add(sc.nextInt());
            }

            Set<Integer> set2 = new HashSet<>();
            for (int i = 0; i < m; i++) {
                set2.add(sc.nextInt());
            }

            // Find intersection
            int common = 0;
            for (int x : set1) {
                if (set2.contains(x)) {
                    common++;
                }
            }

            System.out.println(common);
        }
    }
}
