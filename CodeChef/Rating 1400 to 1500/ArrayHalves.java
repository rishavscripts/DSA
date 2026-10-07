import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayHalves {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] p= new int[2*n];
            for(int i=0;i<2*n;i++){p[i]=sc.nextInt();}
            List<Integer> positions = new ArrayList<>();
            for (int i = 0; i < 2*n; i++) {
                if (p[i] <= n) positions.add(i+1); // store 1-based index
            }
            Collections.sort(positions);

            long swaps = 0;
            for (int i = 0; i < n; i++) {
                swaps += Math.abs(positions.get(i) - (i+1));
            }
            System.out.println(swaps);
        }
	}
}
