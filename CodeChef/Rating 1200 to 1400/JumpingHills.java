import java.util.*;

class JumpingHills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();  // number of hills
            int U = sc.nextInt();  // max upward jump
            int D = sc.nextInt();  // max downward jump
            
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextInt();
            }
            
            int parachuteUsed = 0;  // track if parachute is used
            int pos = 1;            // starting at hill 1
            
            for (int i = 1; i < N; i++) {
                int diff = H[i] - H[i - 1];
                
                if (diff == 0) {
                    pos++;
                } else if (diff > 0 && diff <= U) {
                    pos++;
                } else if (diff < 0 && Math.abs(diff) <= D) {
                    pos++;
                } else if (diff < 0 && parachuteUsed == 0) {
                    parachuteUsed = 1;
                    pos++;
                } else {
                    break;
                }
            }
            
            System.out.println(pos);
        }
        sc.close();
    }
}
