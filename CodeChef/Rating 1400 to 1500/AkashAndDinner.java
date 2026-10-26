import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AkashAndDinner {
    static Scanner sc = new Scanner(System.in);
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    if (!sc.hasNextInt()) return;
	    int t = sc.nextInt();
	    
	    while (t-- > 0) {
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        
	        int[] b = new int[n];
	        for (int i = 0; i < n; i++) {
	            b[i] = sc.nextInt();
	        }
	        
	        // Map to store the minimum cooking time for each category
	        HashMap<Integer, Integer> categoryMinTime = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            categoryMinTime.put(
	                a[i], 
	                Math.min(categoryMinTime.getOrDefault(a[i], Integer.MAX_VALUE), b[i])
	            );
	        }
	        
	        // If we have fewer unique categories than K, output -1
	        if (categoryMinTime.size() < k) {
	            System.out.println("-1");
	            continue;
	        }
	        
	        // Extract the minimum times, sort them, and take the sum of the first K
	        List<Integer> minTimes = new ArrayList<>(categoryMinTime.values());
	        Collections.sort(minTimes);
	        
	        long totalTime = 0;
	        for (int i = 0; i < k; i++) {
	            totalTime += minTimes.get(i);
	        }
	        
	        System.out.println(totalTime);
	    }
	}
}
