import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MightyFriend {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            
            long motu = 0, tomu = 0;
            List<Integer> motuList = new ArrayList<>();
            List<Integer> tomuList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    motu += a[i];
                    motuList.add(a[i]);
                } else {
                    tomu += a[i];
                    tomuList.add(a[i]);
                }
            }

            motuList.sort(Collections.reverseOrder()); // largest first
            Collections.sort(tomuList); // smallest first

            int swaps = Math.min(k, Math.min(motuList.size(), tomuList.size()));
            for (int i = 0; i < swaps; i++) {
                if (motuList.get(i) > tomuList.get(i)) {
                    motu = motu - motuList.get(i) + tomuList.get(i);
                    tomu = tomu - tomuList.get(i) + motuList.get(i);
                } else break;
            }

            System.out.println(tomu > motu ? "YES" : "NO");
        }
	}
}
