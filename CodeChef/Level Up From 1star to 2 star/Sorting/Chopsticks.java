import java.util.*;
public class Chopsticks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] sticks = new int[n];
        for (int i = 0; i < n; i++) {
            sticks[i] = sc.nextInt();
        }
        
        Arrays.sort(sticks);
        int count = 0;
        
        for (int i = 0; i < n - 1; ) {
            if (sticks[i+1] - sticks[i] <= d) {
                count++;
                i += 2; // skip both sticks
            } else {
                i++; // skip one stick
            }
        }
        
        System.out.println(count);
    }
}
