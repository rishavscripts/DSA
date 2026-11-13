import java.util.Scanner;

public class CAOStage1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            solve();
        }
        
        scanner.close();
    }

    private static void solve() {
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        
        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++) {
            grid[i] = scanner.next().toCharArray();
        }
        
        int cpcCount = 0;
        
        // Iterate through every cell to check if it's a CPC
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // A CPC cell itself must be '^'
                if (grid[i][j] != '^') {
                    continue;
                }
                
                // Check if there are at least 2 '^' in all 4 directions (L, R, T, B)
                if (i >= 2 && i < r - 2 && j >= 2 && j < c - 2) {
                    boolean isCPC = true;
                    
                    // Check top and bottom (2 steps)
                    if (grid[i-1][j] != '^' || grid[i-2][j] != '^' || 
                        grid[i+1][j] != '^' || grid[i+2][j] != '^') {
                        isCPC = false;
                    }
                    
                    // Check left and right (2 steps)
                    if (grid[i][j-1] != '^' || grid[i][j-2] != '^' || 
                        grid[i][j+1] != '^' || grid[i][j+2] != '^') {
                        isCPC = false;
                    }
                    
                    if (isCPC) {
                        cpcCount++;
                    }
                }
            }
        }
        
        System.out.println(cpcCount);
    }
}
