import java.util.Scanner;

public class ChefandWork {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            
            boolean possible = true;
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] > k) {
                    possible = false; // A single box is heavier than K
                }
            }
            
            if(!possible) {
                System.out.println(-1);
                continue;
            }
            
            int trips = 0;
            int currentWeight = 0;
            int i = 0;
            
            // Greedy approach: take as many boxes as possible in each trip
            while(i < n) {
                trips++;
                currentWeight = 0;
                while(i < n && currentWeight + arr[i] <= k) {
                    currentWeight += arr[i];
                    i++;
                }
            }
            
            System.out.println(trips);
        }
        sc.close();
    }
}
