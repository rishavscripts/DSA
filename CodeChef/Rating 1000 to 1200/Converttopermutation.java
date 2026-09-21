import java.util.Arrays;
import java.util.Scanner;

public class Converttopermutation {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            Arrays.sort(arr);
            
            long totalOperations = 0;
            boolean possible = true;
            
            for(int i = 0; i < n; i++) {
                int target = i + 1;
                
                if(arr[i] > target) {
                    possible = false;
                    break;
                }
                totalOperations += (target - arr[i]);
            }
            
            if(possible) {
                System.out.println(totalOperations);
            } else {
                System.out.println(-1);
            }
            
        }
	}
}
