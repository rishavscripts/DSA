import java.util.Scanner;

public class MovieWeekend {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] l = new int[n];
            int[] r = new int[n];
            
            for(int i = 0; i < n; i++) {
                l[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                r[i] = sc.nextInt();
            }
            
            int maxProduct = -1;
            int maxRating = -1;
            int bestIndex = -1;
            
            for(int i = 0; i < n; i++) {
                int currentProduct = l[i] * r[i];
                int currentRating = r[i];
                
                // Check if current movie is better
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxRating = currentRating;
                    bestIndex = i + 1; // 1-based indexing
                } 
                else if(currentProduct == maxProduct) {
                    // If product is equal, check the rating
                    if(currentRating > maxRating) {
                        maxRating = currentRating;
                        bestIndex = i + 1; // 1-based indexing
                    }
                }
            }
            
            System.out.println(bestIndex);
        }
    }
}
