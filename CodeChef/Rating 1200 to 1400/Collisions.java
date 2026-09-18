import java.util.*;

public class Collisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // number of boys
            int M = sc.nextInt(); // number of girls
            
            // Read the matrix
            String[] matrix = new String[N];
            for (int i = 0; i < N; i++) {
                matrix[i] = sc.next(); 
            }
            
            int collisions = 0;
            
            // For each girl (column)
            for (int j = 0; j < M; j++) {
                int count = 0;
                // Count how many boys like this girl
                for (int i = 0; i < N; i++) {
                    if (matrix[i].charAt(j) == '1') {
                        count++;
                    }
                }
                // Add number of collisions for this girl
                collisions += (count * (count - 1)) / 2;
            }
            
            System.out.println(collisions);
        }
        
        sc.close();
    }
}
